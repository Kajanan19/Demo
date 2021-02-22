package com.company.suppliercontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.comons.supplier.Supplier;
import com.company.service.SupplierServiceImpl;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    @Autowired
    private SupplierServiceImpl supplierServiceImpl;
    
    @RequestMapping("")
    public List<Supplier> getAllSupplier() {
        return supplierServiceImpl.getAllSupplier();
    }

    @RequestMapping("/{id}")
    public Optional<Supplier> searchSupplier(@PathVariable int id) {
        return supplierServiceImpl.searchSupplier(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addCategory(@RequestBody Supplier supplier) {
    	supplierServiceImpl.addCategory(supplier);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCategory(@RequestBody Supplier supplier) {
    	supplierServiceImpl.updateCategory(supplier);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteCategory(@RequestBody Supplier supplier) {
    	supplierServiceImpl.deleteCategory(supplier);
    }



}

