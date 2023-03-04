package com.cjc.springbootrestapiLTTHomeLoanProject.aap.documentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springbootrestapiLTTHomeLoanProject.aap.Dao.DocumetDaoImpl;
import com.cjc.springbootrestapiLTTHomeLoanProject.aap.model.Model;

@Service
public class DocumentUploadService implements DocumentuploadSerInt {

	@Autowired
	DocumetDaoImpl docdaorep;

	public List<Model> saveDocuments(Model mode) {
	
		docdaorep.save(mode);
		List<Model> list= docdaorep.findAll();
		return list;
	}

	@Override
	public List<Model> getAllDoc() {
		
		return docdaorep.findAll();
	}
	
	
	
	
	

}
