package com.sujata.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.bean.Item;
import com.sujata.model.persistence.ItemDao;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	
	public List<Item> getAllItems() {
		return itemDao.getAllRecords();
	}

	
	public boolean addItem(Item item) {
		
		return itemDao.addRecord(item);
	}

	
	public boolean deleteItem(int id) {
		
		return itemDao.deleteRecord(id);
	}

	
	public boolean updateItem(int id, Item newItem) {
		
		return itemDao.updateRecord(id, newItem);
	}

	
	public Item getItem(int id) {
		return itemDao.getRecord(id);
	}

}
