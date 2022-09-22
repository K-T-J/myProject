package com.study.myProject.petBill.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "petBillUsers")
public class PetBillUsers {
	
	@Id
	@Column(name = "ID",nullable = false, length = 50)
	private String id;
	
	@Column(name = "PW",nullable = false, length = 50)
	private String pw;
	
	@Column(name = "NAME",nullable = false, length = 50)
	private String name;
	
	@Column(name = "MOBILE",nullable = false, length = 100)
	private String mobile;
	
	@Column(name = "NICKNAME", unique = true, length = 20)
	private String nickName;
	
	@Column(name = "REG")
	private Date reg;
	
	@Column(name = "USERACTIVENUM", length = 50)
	@ColumnDefault(value = "활성화")
	private String useractivenum;
	
	@Column(name = "USERREASON", length = 200)
	@ColumnDefault(value = "none")
	private String userreason;
	
	@Column(name = "KAKAOLOGIN", length = 50)
	@ColumnDefault(value = "none")
	private String kakaologin;

}
