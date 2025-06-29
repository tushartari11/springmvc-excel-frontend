package com.rekreation.learning.spring_mvc_example.repository;

import com.rekreation.learning.spring_mvc_example.entity.InvoiceData2015To2017;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceData2015To2017Repository extends PagingAndSortingRepository<InvoiceData2015To2017, Long> {
    List<InvoiceData2015To2017> findByCustomerNameContaining(String customerName);

    List<InvoiceData2015To2017> findByBranchAndTaluka(String branch, String taluka);
}
