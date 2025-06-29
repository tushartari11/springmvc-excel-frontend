package com.rekreation.learning.spring_mvc_example.repository;

import com.rekreation.learning.spring_mvc_example.entity.InvoiceData2007To2014;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceData2007To2014Repository extends PagingAndSortingRepository<InvoiceData2007To2014, Long> {

    List<InvoiceData2007To2014> findByCustomerNameContaining(String customerName);

}
