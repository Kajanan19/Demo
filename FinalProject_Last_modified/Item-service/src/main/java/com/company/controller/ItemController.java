package com.company.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.comons.item.Item;
import com.company.serviceimpl.ItemServiceImpl;

@RestController
public class ItemController {

	@Autowired
	ItemServiceImpl itemServiceImpl;
	
	@GetMapping("/item")
	public List<Item> getAllItems(){
		return itemServiceImpl.getAllItems();
	}
	
	
	@PostMapping(value = "/item")
	public Item createItem(@RequestBody Item item) {
		return itemServiceImpl.createItem(item);
	}
	
	
	@RequestMapping(value = "item/{id}", method=RequestMethod.GET)
	public Optional<Item> viewItembyId(@PathVariable int id) {
		return itemServiceImpl.viewItemById(id);
	}
	
	@RequestMapping(value = "/item/{id}", method = RequestMethod.PUT)
	public void updateItemById(@PathVariable int id, @RequestBody Item item) {
		itemServiceImpl.updateItemById(id, item);
	}
	
	@RequestMapping(value = "/item/{id}", method = RequestMethod.DELETE)
	public void deleteItemById(@PathVariable int id) {
		itemServiceImpl.deleteItemById(id);
	}
	
	
	
	
}
