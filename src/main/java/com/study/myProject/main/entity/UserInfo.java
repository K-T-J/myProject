package com.study.myProject.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserInfo")
public class UserInfo{
	
	@Id
	@Column(name = "ID", nullable = false, length = 20)
	private String id;
	
	@Column(name = "PW", length = 20)
	private String pw;
	
	@Column(name = "EMAIL", length = 255)
	private String email;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
