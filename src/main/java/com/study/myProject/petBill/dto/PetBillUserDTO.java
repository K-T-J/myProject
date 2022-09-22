package com.study.myProject.petBill.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetBillUserDTO {
	
	private String id;					//아이디
	private String pw;					//비밀번호
	private String name;				//이름
	private String mobile;				//핸드폰
	private String nickname;			//닉네임
	private Timestamp reg;				//가입날짜
	private String useractivenum;		//상태
	private String userreason;			//이유

}
