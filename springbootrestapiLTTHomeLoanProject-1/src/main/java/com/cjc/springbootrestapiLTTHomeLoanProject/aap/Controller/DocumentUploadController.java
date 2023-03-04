package com.cjc.springbootrestapiLTTHomeLoanProject.aap.Controller;

import java.util.List;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.springbootrestapiLTTHomeLoanProject.aap.documentService.DocumentUploadService;
import com.cjc.springbootrestapiLTTHomeLoanProject.aap.model.Model;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class DocumentUploadController {
	
	@Autowired 
	  DocumentUploadService documentservice;
	
	@PostMapping(value="/documents", consumes= MediaType.MULTIPART_FORM_DATA_VALUE)
	  public List<Model> UploadDocuments( @RequestPart(value="photoId",required=true) MultipartFile file1, @RequestPart(value="panCard",required=true) MultipartFile file2) 
	  {
		  
		  ObjectMapper om= new ObjectMapper();
		    //   Model mod= om.readValue(Model1, Model.class);
		       
		       Model mode= new Model();
		           mode.setPhotoId(file1.getBytes());
		           mode.setPanCard(file2.getBytes());
		           
		          List<Model> list= documentservice.saveDocuments(mode);
		           
		   return list;
	  }
	   
	
	@GetMapping("GetallDoc")
	 public List<Model> getAllDoc()
	 { 
		List<Model> list= documentservice.getAllDoc();
		  return list;
	 }


}
