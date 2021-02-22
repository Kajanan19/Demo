package com.comany.Invoiceservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comany.Invoiceservice.repository.InvoiceRepository;
import com.comany.Invoiceservice.service.InvoiceService;
import com.company.comons.invoice.Invoice;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	
	@Autowired
	InvoiceRepository invoiceRepository;

	@Override
	public List<Invoice> getAllInvoices() {
		// TODO Auto-generated method stub
		return invoiceRepository.findAll();
	}

}
