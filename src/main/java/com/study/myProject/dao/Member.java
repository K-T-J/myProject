package com.study.myProject.dao;

import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
public class Member {
	
	@ApiParam(value="member id",required = true)
	private String id;
	
	@ApiParam(value="member age", required = true)
	private String age;
	
	@ApiParam(value="member email", required = true)
	private String email;

}
