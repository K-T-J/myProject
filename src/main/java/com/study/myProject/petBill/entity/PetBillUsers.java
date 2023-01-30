package com.study.myProject.petBill.entity;



import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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
	private LocalDateTime reg;
	
	@Column(name = "USERACTIVENUM", length = 50, columnDefinition = "varchar(50) default '활성화'")
	private String useractivenum;
	
	@Column(name = "USERREASON", length = 200, columnDefinition = "varchar(200) default 'none'")
	private String userreason;
	
	@Column(name = "KAKAOLOGIN", length = 50, columnDefinition = "varchar(50) default 'none'")
	private String kakaologin;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public LocalDateTime getReg() {
		return reg;
	}

	public void setReg(LocalDateTime reg) {
		this.reg = reg;
	}

	public String getUseractivenum() {
		return useractivenum;
	}

	public void setUseractivenum(String useractivenum) {
		this.useractivenum = useractivenum;
	}

	public String getUserreason() {
		return userreason;
	}

	public void setUserreason(String userreason) {
		this.userreason = userreason;
	}

	public String getKakaologin() {
		return kakaologin;
	}

	public void setKakaologin(String kakaologin) {
		this.kakaologin = kakaologin;
	}

	
}
