package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.comons.supplier.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

}
