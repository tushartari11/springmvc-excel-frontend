package com.rekreation.learning.spring_mvc_example.entity;

import jakarta.persistence.*;

/**
 * Base abstract entity for invoice data using Table-Per-Class inheritance strategy
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(name = "invoice_seq", sequenceName = "invoice_sequence", allocationSize = 1)
public abstract class InvoiceData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invoice_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "source_sheet", columnDefinition = "TEXT")
    private String sourceSheet = "";

    @Column(name = "customer_name", columnDefinition = "TEXT")
    private String customerName = "";

    @Column(name = "taluka", columnDefinition = "TEXT")
    private String taluka = "";

    @Column(name = "model", columnDefinition = "TEXT")
    private String model = "";

    // Constructors
    public InvoiceData() {}

    public InvoiceData(String sourceSheet, String customerName, String taluka, String model) {
        this.sourceSheet = sourceSheet;
        this.customerName = customerName;
        this.taluka = taluka;
        this.model = model;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceSheet() {
        return sourceSheet;
    }

    public void setSourceSheet(String sourceSheet) {
        this.sourceSheet = sourceSheet;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTaluka() {
        return taluka;
    }

    public void setTaluka(String taluka) {
        this.taluka = taluka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
