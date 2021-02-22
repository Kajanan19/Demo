package com.company.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.Repository.ItemRepository;
import com.company.comons.item.Item;
import com.company.service.ItemService;;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemRepository itemRepository;

	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Override
	public java.util.Optional<Item> viewItemById(int id) {
		// TODO Auto-generated method stub
		return itemRepository.findById(id);
	}

	@Override
	public void updateItemById(int id, Item item) {
		// TODO Auto-generated method stub
		itemRepository.save(item);
	}

	@Override
	public void deleteItemById(int id) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(id);
	}

}
