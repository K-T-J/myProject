package com.study.myProject.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;

@Api(value = "MainController", tags = "메인 컨트롤러")
@Controller
public class MainController {

	@GetMapping("/api/get/main")
	public String main(HttpServletRequest request) {
		return "page/main";
	}
}
