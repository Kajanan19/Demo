package com.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.comons.supplier.Supplier;
import com.company.repository.SupplierRepository;


@Service
public class SupplierServiceImpl implements SupplierService {
	
	 @Autowired
	    private SupplierRepository supplierRepository;

	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return supplierRepository.findAll();
	}

	@Override
	public Optional<Supplier> searchSupplier(int id) {
		// TODO Auto-generated method stub
		return supplierRepository.findById(id);
	}

	@Override
	public void addCategory(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierRepository.save(supplier);
		
	}

	@Override
	public void updateCategory(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierRepository.save(supplier);
		
	}

	@Override
	public void deleteCategory(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierRepository.delete(supplier);
		
	}

}
