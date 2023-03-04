package com.cjc.springbootrestapiLTTHomeLoanProject.aap.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer StuId;
	@Lob
	private byte[] photoId;
	@Lob
	private byte[] panCard;
	
	
}
