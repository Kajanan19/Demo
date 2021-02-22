package com.comany.Invoiceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.comany.Invoiceservice.serviceimpl.InvoiceServiceImpl;
import com.company.comons.invoice.Invoice;

@RestController
public class InvoiceController {

	@Autowired
	InvoiceServiceImpl invoiceServiceImpl;
	
	public List<Invoice> getAllinvoices(){
		return invoiceServiceImpl.getAllInvoices();
	}
}
