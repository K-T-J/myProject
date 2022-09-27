package com.study.myProject.petBill.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetBillReviewDTO {
	
	private Integer reviewNo;
	private String reviewSubject;
	private String reviewId;
	private String reviewPetType;
	private String reviewArticle;
	private String reviewPhoto;
	private String reviewPrice;
	private String reviewContent;
	private Integer reviewHosNo;
	private Timestamp reviewDate;

}
