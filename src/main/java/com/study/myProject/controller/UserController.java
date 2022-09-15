package com.study.myProject.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.study.myProject.dto.UserDTO;
import com.study.myProject.entity.Users;
import com.study.myProject.enums.EnYn;
import com.study.myProject.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;



@Api(value = "UserController", tags = "유저 컨트롤러")
@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userservice;
	
	/**
	 * 
	 * 회원가입 페이지
	 * 
	 * */
	@GetMapping(value = "signUp")
	public String singUp() {

		return "user/signUp";
	}
	
	/**
	 * 
	 * 아이디 중복 체크
	 * 
	 * */
	@ApiOperation("아이디 중복 체크")
	@ResponseBody
	@PostMapping(value = "idCheck")
	public String idCheck(String id) {
		
		 Optional<Users> user = userservice.idCheckService(id);
		 
		 if(!user.isEmpty()) {
			 System.out.println("값 있음");
			 return EnYn.YES.getCode();
		 }
		 System.out.println("값 없음");
		
		return EnYn.NO.getCode();
	}
	
	
	/**
	 * 
	 * 회원가입
	 * 
	 * */
	
	@ApiOperation("회원가입")
	@ResponseBody//상단에 @Restcontroller가 아닌 @controller로 작성할땐 @ResponseBody로 ajax를 받는다 
	@PostMapping(value = "signupSubmit")
	public String signupSubmit(UserDTO userDTO) {
		
		String result = userservice.signupSubmitService(userDTO);
		
		return result;
	}
	
	/**
	 * 
	 * 로그인
	 * 
	 * */
	@ApiOperation("로그인")
	@GetMapping(value = "login")
	public String login() {
		
		return "user/login";
	}

}
