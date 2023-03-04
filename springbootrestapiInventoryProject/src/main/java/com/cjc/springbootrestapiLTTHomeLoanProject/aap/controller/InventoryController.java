package com.cjc.springbootrestapiLTTHomeLoanProject.aap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.springbootrestapiLTTHomeLoanProject.aap.Service.InventoryServiceImpl;
import com.cjc.springbootrestapiLTTHomeLoanProject.aap.model.Inventory;

import lombok.Delegate;

@RestController
public class InventoryController {
	
	@Autowired
	  InventoryServiceImpl inventoryser;
	
	@PostMapping("/postAllProducts")
	public List<Inventory> postallProducts(@RequestBody Inventory invent)
	{
		//Inventory invent11= inventoryser.saveAllProduct(invent);
		
		List<Inventory> list= inventoryser.saveAllProduct(invent);
		return list; 
		
	}
	
	
	@GetMapping("/getAllProduct")
	  public List<Inventory> getAllProduct()
	  { 
		
		List<Inventory> list= inventoryser.getAllProducts();
		
		   return list;
	  }
	  
	
	@DeleteMapping("/deleteProduct")
	  public void deleteProduct(@PathVariable("ProductId") Integer productId )
	  {
		
		Inventory invent= inventoryser.delteProduct(productId);
		
	  }
	  
	  
	  @PutMapping("/updateProduct")
	    public void updateProduct(@RequestBody Inventory inven, @PathVariable("ProductId") Integer productId)
	    { 
		  
		  Inventory invent= inventoryser.updateInventory(productId,inven);
		  
	    }
	  
	  
	  
	  
	  

}
