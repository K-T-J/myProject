package com.study.myProject.petBill.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetBillAdminDTO {

	private Integer noticeNo;
	private String noticeId;
	private String noticeSubject;
	private String noticeContent;
	private String noticePhoto;
	private Timestamp reg;
	
}
