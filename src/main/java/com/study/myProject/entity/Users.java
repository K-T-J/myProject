package com.study.myProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users{
	
	@Id
	@Column(name = "ID", nullable = false, length = 20)
	private String id;
	
	@Column(name = "EMAIL", length = 255)
	private String email;
	
	@Column(name = "PASSWORD", length = 20)
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	
}
