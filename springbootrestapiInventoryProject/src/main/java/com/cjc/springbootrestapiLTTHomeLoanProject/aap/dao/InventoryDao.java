package com.cjc.springbootrestapiLTTHomeLoanProject.aap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.springbootrestapiLTTHomeLoanProject.aap.model.Inventory;

@Repository
public interface InventoryDao extends JpaRepository<Integer, Inventory> {

	public Inventory deleteById(Integer productId);

}
