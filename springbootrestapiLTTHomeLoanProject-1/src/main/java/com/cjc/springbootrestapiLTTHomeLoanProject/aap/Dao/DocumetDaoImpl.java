package com.cjc.springbootrestapiLTTHomeLoanProject.aap.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.springbootrestapiLTTHomeLoanProject.aap.model.Model;

@Repository
public interface DocumetDaoImpl extends JpaRepository<Integer, Model>{

	void save(Model mode);



}
