package com.study.myProject.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "UserDTO", description = "유저 회원가입 정보")
public class UserDTO {

	@ApiModelProperty(value = "아이디", example = "userId", required = true)
	private String id;
	
	@ApiModelProperty(value="이메일", example = "email@naver.com", required = true)
	private String email;
	
	@ApiModelProperty(value="비밀번호", example = "1234" , required = true)
	private String password;

}
