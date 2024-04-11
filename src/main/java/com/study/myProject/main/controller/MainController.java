package com.study.myProject.main.controller;
import javax.servlet.http.HttpServletRequest;

//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.myProject.main.dto.UserDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "MainController", tags = "메인 컨트롤러")
@Controller
public class MainController {

	@GetMapping(value = "/main")
	public String mainPage(HttpServletRequest request) {
		return "page/main";
	}
	
//	@PostMapping(value = "/loginCheck")
//	public String loginCheck(@AuthenticationPrincipal UserDetails userDetails) {
//		
//		System.out.println();
//		return null;
//	}
	/**
	 * 로그인 
	 * @return
	 */
	@ApiOperation("로그인 페이지")
	@GetMapping(value = "/login")
	public String login() {
		return "user/login";
	}
}
