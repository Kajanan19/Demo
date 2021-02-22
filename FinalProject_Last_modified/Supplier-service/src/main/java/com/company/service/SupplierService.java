package com.company.service;

import java.util.Optional;
import com.company.comons.supplier.Supplier;

public interface SupplierService {
	Iterable<Supplier> getAllSupplier();
	Optional<Supplier> searchSupplier(int id);
	void addCategory(Supplier supplier);
	void updateCategory(Supplier supplier);
	void deleteCategory(Supplier supplier);
	
}
