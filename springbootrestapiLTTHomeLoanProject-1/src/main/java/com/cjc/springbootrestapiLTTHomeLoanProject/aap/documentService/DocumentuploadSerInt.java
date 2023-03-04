package com.cjc.springbootrestapiLTTHomeLoanProject.aap.documentService;

import java.util.List;

import com.cjc.springbootrestapiLTTHomeLoanProject.aap.model.Model;

public interface DocumentuploadSerInt {

	public List<Model> saveDocuments(Model mode) ;

	List<Model> getAllDoc();
}
