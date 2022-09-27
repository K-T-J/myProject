package com.study.myProject.petBill.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetBillMtmDTO {
	
	private Integer mtmno;
	private String mtmuserid;
	private String mtmsubject;
	private String mtmcontent;
	private Timestamp reg;
	private String ref;
	
}
