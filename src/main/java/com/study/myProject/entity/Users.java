package com.study.myProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class Users {
	
	@Id
	@Column(name = "ID", nullable = false, length = 20)
	private String id;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PASSWORD", length = 20)
	private String password;
	

}
