package com.study.myProject.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.myProject.component.SessionManager;
import com.study.myProject.dto.UserDTO;
import com.study.myProject.service.UserService;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api(value = "MainController", tags = "메인 컨트롤러")
@Controller
@RequiredArgsConstructor
public class MainController {
	
	private final SessionManager sessionManager;
	private final UserService userService;
	
	@GetMapping("/main")
	public String test(HttpServletRequest request) {
		
		//임시 데이터
		UserDTO userDTO = new UserDTO(); 
		userDTO.setId("java");
		userDTO.setPassword("1234");
		userDTO.setEmail("java@naver.com");
		userService.signupSubmitService(userDTO);
		
		//세션 확인
		System.out.println("request >> " + sessionManager.getSession(request));
		
		
		
		return "page/main";
	}
}
