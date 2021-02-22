package com.company.service;

import java.util.List;
import java.util.Optional;

import com.company.comons.item.Item;


public interface ItemService {

	List<Item> getAllItems();
	Item createItem(Item item);
	Optional<Item> viewItemById(int id);
	void updateItemById(int id, Item item);
	void deleteItemById(int id);
}
