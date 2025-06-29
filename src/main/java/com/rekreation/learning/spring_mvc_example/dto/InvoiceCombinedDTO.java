package com.rekreation.learning.spring_mvc_example.dto;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class InvoiceCombinedDTO implements Serializable  {

    private static final long serialVersionUID = 1L;
    // Fields from InvoiceData2015To2017
    private Long id;
    private String sourceSheet;
    private String taluka;
    private String customerName;
    private String model = "";

    private Long mtd = 0L;
    private Long jc = 0L;
    private Long dc = 0L;
    private String branch;
    private String finBy;
    private LocalDate monthyear = LocalDate.of(1900, 1, 1);
    private LocalDate orderDate = LocalDate.of(1900, 1, 1);
    private LocalDate paytConfDate = LocalDate.of(1900, 1, 1);
    private LocalDate mcBilled = LocalDate.of(1900, 1, 1);
    private String deliveryDate = "";
    private String insuStatus = "";
    private LocalDate paytDdDate = LocalDate.of(1900, 1, 1);
    private String paytRecDate = "";
    private Long doAmt = 0L;


    // Fields from InvoiceData2007To2014

    private Long srNo = 0L;
    private LocalDate year = LocalDate.of(1900, 1, 1);
    private LocalDate billDate = LocalDate.of(1900, 1, 1);
    private Long invoiceNo = 0L;
    private String machineNo = "";
    private String address = "";
    private String dist = "";
    private String state = "";


    // Getters and setters
}
