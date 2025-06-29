package com.rekreation.learning.spring_mvc_example.controller;

import com.rekreation.learning.spring_mvc_example.service.InvoiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/view")
    public ModelAndView getPagedInvoices(@RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "10") int size,
                                         @RequestParam(defaultValue = "id") String sortBy) {
        ModelAndView modelAndView = new ModelAndView("invoices");

        modelAndView.addObject("invoices", invoiceService.getAllCombinedInvoices(page, size, sortBy));
//        modelAndView.addObject("search", search);
        return modelAndView;
    }
}
