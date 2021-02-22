package com.comany.Invoiceservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.comons.invoice.Invoice;


@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{

}
