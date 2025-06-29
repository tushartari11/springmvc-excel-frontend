package com.rekreation.learning.spring_mvc_example.service;

import com.rekreation.learning.spring_mvc_example.dto.InvoiceCombinedDTO;
import com.rekreation.learning.spring_mvc_example.entity.InvoiceData2007To2014;
import com.rekreation.learning.spring_mvc_example.entity.InvoiceData2015To2017;
import com.rekreation.learning.spring_mvc_example.repository.InvoiceData2007To2014Repository;
import com.rekreation.learning.spring_mvc_example.repository.InvoiceData2015To2017Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceService {

    // Inside InvoiceService
    private static final Logger logger = LoggerFactory.getLogger(InvoiceService.class);

    private final InvoiceData2015To2017Repository repo2015;

    private final InvoiceData2007To2014Repository repo2007;

    public InvoiceService(InvoiceData2015To2017Repository repo2015,
                          InvoiceData2007To2014Repository repo2007) {
        this.repo2015 = repo2015;
        this.repo2007 = repo2007;
    }


    @Cacheable("combinedInvoices")
    public List<InvoiceCombinedDTO> getAllCombinedInvoicesUnpaged(String sortBy) {
        List<InvoiceCombinedDTO> combinedList = new ArrayList<>();

        // Fetch all and map
        repo2015.findAll(Sort.by(sortBy)).forEach(inv -> combinedList.add(getInvoiceCombinedDTO(inv)));
        //repo2007.findAll(Sort.by(sortBy)).forEach(inv -> combinedList.add(getInvoiceCombinedDTO(inv)));

        // Optionally, sort combinedList here if needed
        // combinedList.sort(...);

        return combinedList;
    }

/* This is for seach functionality
    however, it is not used in the current implementation.
    we need to finalise this later.
    If we want to implement search functionality, we have to implement the respective methods in the repository.
 */

//    public Page<Invoice> getAllCombinedInvoices(int page, int size, String sortBy, String search) {
//        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
//        if (search != null && !search.isEmpty()) {
//            // Example: search by customer name or JC
//            return invoiceRepository.findByCustomerNameContainingIgnoreCaseOrJcContainingIgnoreCase(
//                    search, search, pageable
//            );
//        } else {
//            return invoiceRepository.findAll(pageable);
//        }
//    }

    public Page<InvoiceCombinedDTO> getAllCombinedInvoices(int page, int size, String sortBy) {
        List<InvoiceCombinedDTO> combinedList = getAllCombinedInvoicesUnpaged(sortBy);

        int start = Math.min(page * size, combinedList.size());
        int end = Math.min(start + size, combinedList.size());
        List<InvoiceCombinedDTO> paged = combinedList.subList(start, end);
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));

        return new PageImpl<>(paged, pageable, combinedList.size());
    }


    private static InvoiceCombinedDTO getInvoiceCombinedDTO(InvoiceData2007To2014 inv2) {
        InvoiceCombinedDTO dto2007To2014 = new InvoiceCombinedDTO();
        dto2007To2014.setId(inv2.getId());
        dto2007To2014.setSourceSheet(inv2.getSourceSheet());
        dto2007To2014.setSrNo(inv2.getSrNo());
        dto2007To2014.setYear(inv2.getYear());
        dto2007To2014.setBillDate(inv2.getBillDate());
        dto2007To2014.setInvoiceNo(inv2.getInvoiceNo());
        dto2007To2014.setMachineNo(inv2.getMachineNo());
        dto2007To2014.setModel(inv2.getModel());
        dto2007To2014.setCustomerName(inv2.getCustomerName());
        dto2007To2014.setAddress(inv2.getAddress());
        dto2007To2014.setTaluka(inv2.getTaluka());
        dto2007To2014.setDist(inv2.getDist());
        dto2007To2014.setState(inv2.getState());
        return dto2007To2014;
    }

    private static InvoiceCombinedDTO getInvoiceCombinedDTO(InvoiceData2015To2017 inv1) {
        InvoiceCombinedDTO dto2015To2017 = new InvoiceCombinedDTO();
        dto2015To2017.setId(inv1.getId());
        dto2015To2017.setSourceSheet(inv1.getSourceSheet());
        dto2015To2017.setMtd(inv1.getMtd());
        dto2015To2017.setJc(inv1.getjC());
        dto2015To2017.setDc(inv1.getdC());
        dto2015To2017.setCustomerName(inv1.getCustomerName());
        dto2015To2017.setTaluka(inv1.getTaluka());
        dto2015To2017.setBranch(inv1.getBranch());
        dto2015To2017.setModel(inv1.getModel());
        dto2015To2017.setFinBy(inv1.getFinBy());
        dto2015To2017.setMonthyear(inv1.getMonthYear());
        dto2015To2017.setOrderDate(inv1.getOrderDate());
        dto2015To2017.setPaytConfDate(inv1.getPaytConfDate());
        dto2015To2017.setMcBilled(inv1.getMcBilled());
        dto2015To2017.setDeliveryDate(inv1.getDeliveryDate());
        dto2015To2017.setInsuStatus(inv1.getInsuStatus());
        dto2015To2017.setPaytDdDate(inv1.getPaytDdDate());
        dto2015To2017.setPaytRecDate(inv1.getPaytRecDate());
        dto2015To2017.setMachineNo(String.valueOf(inv1.getMcNo()));
        dto2015To2017.setDoAmt(inv1.getDoAmt());
        return dto2015To2017;
    }

    public Page<InvoiceData2015To2017> getInvoiceData2015To2017(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return repo2015.findAll(pageable);
    }

    public Page<InvoiceData2007To2014> getInvoiceData2007To2014(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return repo2007.findAll(pageable);
    }

}
