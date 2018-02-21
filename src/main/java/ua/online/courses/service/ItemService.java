package ua.online.courses.service;

import java.util.List;

import ua.online.courses.entity.Item;

public interface ItemService {
	
	List<Item> showAllItems();
	
	void saveItem(Item item);
	
	Item findById(int id);
	 
	Item findItemByName(String name);
	
	void deleteItem(int id);
}
