package com.rekreation.learning.spring_mvc_example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

/**
 * Entity for invoice data from 2015-2017
 */
@Entity
@Table(name = "invoice_data_2015_2017")
public class InvoiceData2015To2017 extends InvoiceData {

    @Column(name = "mtd")
    private Long mtd = 0L;

    @Column(name = "j_c")
    private Long jC = 0L;

    @Column(name = "d_c")
    private Long dC = 0L;

    @Column(name = "branch", columnDefinition = "TEXT")
    private String branch = "";

    @Column(name = "fin_by", columnDefinition = "TEXT")
    private String finBy = "";

    @Column(name = "monthyear")
    private LocalDate monthYear = LocalDate.of(1900, 1, 1);

    @Column(name = "order_date")
    private LocalDate orderDate = LocalDate.of(1900, 1, 1);

    @Column(name = "payt_conf_date")
    private LocalDate paytConfDate = LocalDate.of(1900, 1, 1);

    @Column(name = "mc_billed")
    private LocalDate mcBilled = LocalDate.of(1900, 1, 1);

    @Column(name = "delivery_date", columnDefinition = "TEXT")
    private String deliveryDate = "";

    @Column(name = "insu_status", columnDefinition = "TEXT")
    private String insuStatus = "";

    @Column(name = "payt_dd_date")
    private LocalDate paytDdDate = LocalDate.of(1900, 1, 1);

    @Column(name = "payt_rec_date", columnDefinition = "TEXT")
    private String paytRecDate = "";

    @Column(name = "mc_no")
    private Long mcNo = 0L;

    @Column(name = "do_amt")
    private Long doAmt = 0L;

    // Constructors
    public InvoiceData2015To2017() {
        super();
    }

    public InvoiceData2015To2017(String sourceSheet, String customerName, String taluka,
                                 String model, String branch, String finBy) {
        super(sourceSheet, customerName, taluka, model);
        this.branch = branch;
        this.finBy = finBy;
    }

    // Getters and Setters
    public Long getMtd() {
        return mtd;
    }

    public void setMtd(Long mtd) {
        this.mtd = mtd;
    }

    public Long getjC() {
        return jC;
    }

    public void setjC(Long jC) {
        this.jC = jC;
    }

    public Long getdC() {
        return dC;
    }

    public void setdC(Long dC) {
        this.dC = dC;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getFinBy() {
        return finBy;
    }

    public void setFinBy(String finBy) {
        this.finBy = finBy;
    }

    public LocalDate getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(LocalDate monthYear) {
        this.monthYear = monthYear;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getPaytConfDate() {
        return paytConfDate;
    }

    public void setPaytConfDate(LocalDate paytConfDate) {
        this.paytConfDate = paytConfDate;
    }

    public LocalDate getMcBilled() {
        return mcBilled;
    }

    public void setMcBilled(LocalDate mcBilled) {
        this.mcBilled = mcBilled;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getInsuStatus() {
        return insuStatus;
    }

    public void setInsuStatus(String insuStatus) {
        this.insuStatus = insuStatus;
    }

    public LocalDate getPaytDdDate() {
        return paytDdDate;
    }

    public void setPaytDdDate(LocalDate paytDdDate) {
        this.paytDdDate = paytDdDate;
    }

    public String getPaytRecDate() {
        return paytRecDate;
    }

    public void setPaytRecDate(String paytRecDate) {
        this.paytRecDate = paytRecDate;
    }

    public Long getMcNo() {
        return mcNo;
    }

    public void setMcNo(Long mcNo) {
        this.mcNo = mcNo;
    }

    public Long getDoAmt() {
        return doAmt;
    }

    public void setDoAmt(Long doAmt) {
        this.doAmt = doAmt;
    }
}