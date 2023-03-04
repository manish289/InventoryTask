package com.cjc.springbootrestapiLTTHomeLoanProject.aap.Service;

import java.util.List;

import com.cjc.springbootrestapiLTTHomeLoanProject.aap.dao.InventoryDao;
import com.cjc.springbootrestapiLTTHomeLoanProject.aap.model.Inventory;

public interface InventoryServiceInterface {

	public  List<Inventory>  saveAllProduct(Inventory invent);

	List<Inventory> getAllProducts();

	Inventory delteProduct(Integer productId);

	
	Inventory updateInventory(Integer productId, Inventory inven);
}
