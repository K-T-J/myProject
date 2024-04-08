package com.study.myProject.main.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.myProject.component.SessionManager;
import com.study.myProject.main.dto.UserDTO;
import com.study.myProject.main.entity.UserInfo;
import com.study.myProject.main.enums.EnYn;
import com.study.myProject.main.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;



@Api(value = "UserController", tags = "유저 컨트롤러")
@Controller
public class UserController {
	@Autowired
	private UserService userservice;
	@Autowired
	private SessionManager sessionManager;

	/*
	 * 회원가입 페이지
	 * @return
	 */
	@ApiOperation("회원가입 페이지")
	@GetMapping(value = "signUp")
	public String singUp() {
		return "user/signUp";
	}

//	/**
//	 * 아이디 중복 체크
//	 * @param id
//	 * @return
//	 */
//	@ApiOperation("아이디 중복 체크")
//	@ResponseBody
//	@PostMapping(value = "idCheck")
//	public String idCheck(@ApiParam(value = "유저 아이디", required = true) @RequestParam(name = "id", required = true ) String id) {
//		
//		 Optional<UserInfo> user = userservice.idCheckService(id);
//		 
//		 if(!user.isEmpty()) {
//			 return EnYn.YES.getCode();
//		 }
//		
//		return EnYn.NO.getCode();
//	}

	/**
	 * 회원가입
	 * @param userDTO
	 * @return
	 */
	@ApiOperation("회원가입")
	@ResponseBody//상단에 @Restcontroller가 아닌 @controller로 작성할땐 @ResponseBody로 ajax를 받는다 
	@PostMapping(value = "signupSubmit")
	public String signupSubmit(UserDTO userDTO) {
		
		String result = userservice.signupSubmitService(userDTO);
		return result;
	}



//	/**
//	 * 로그인
//	 * @param id
//	 * @param password
//	 * @param httpServletResponse
//	 * @param request
//	 * @return
//	 */
//	@ApiOperation("로그인")
//	@ResponseBody
//	@PostMapping(value = "loginCheck")
//	public String loginCheck(
//			@ApiParam(value = "아이디", required = true) @RequestParam(name = "id", required = true) String id,
//			@ApiParam(value = "비밀번호", required = true) @RequestParam(name = "password", required = true) String password
//			, HttpServletResponse httpServletResponse, HttpServletRequest request) {
//		
//		UserInfo users = userservice.loginCheckService(id, password);
//		if(users != null) {
//			//세션 생성
//			sessionManager.createSession(id, httpServletResponse);
//			return EnYn.YES.getCode(); 
//		}
//		return EnYn.NO.getCode();
//	}

}
