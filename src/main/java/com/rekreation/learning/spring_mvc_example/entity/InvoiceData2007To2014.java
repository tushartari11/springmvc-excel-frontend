package com.rekreation.learning.spring_mvc_example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

/**
 * Entity for invoice data from 2007-2014
 */
@Entity
@Table(name = "invoice_data_2007_2014")
public class InvoiceData2007To2014 extends InvoiceData {

    @Column(name = "srno")
    private Long srNo = 0L;

    @Column(name = "year")
    private LocalDate year = LocalDate.of(1900, 1, 1);

    @Column(name = "bill_date")
    private LocalDate billDate = LocalDate.of(1900, 1, 1);

    @Column(name = "invoice_no")
    private Long invoiceNo = 0L;

    @Column(name = "machine_no", columnDefinition = "TEXT")
    private String machineNo = "";

    @Column(name = "address", columnDefinition = "TEXT")
    private String address = "";

    @Column(name = "dist", columnDefinition = "TEXT")
    private String dist = "";

    @Column(name = "state", columnDefinition = "TEXT")
    private String state = "";

    // Constructors
    public InvoiceData2007To2014() {
        super();
    }

    public InvoiceData2007To2014(String sourceSheet, String customerName, String taluka,
                                 String model, String machineNo, String address,
                                 String dist, String state) {
        super(sourceSheet, customerName, taluka, model);
        this.machineNo = machineNo;
        this.address = address;
        this.dist = dist;
        this.state = state;
    }

    // Getters and Setters
    public Long getSrNo() {
        return srNo;
    }

    public void setSrNo(Long srNo) {
        this.srNo = srNo;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}