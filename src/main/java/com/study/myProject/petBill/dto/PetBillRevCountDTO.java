package com.study.myProject.petBill.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetBillRevCountDTO {

	private Integer hosNo;
	private String hosNum;
	private String hosSi;
	private String hosGu;
	private String hosName;
	private String hosNewAddress;
	private String x;
	private String y;
	private Integer revCount;
	
}
