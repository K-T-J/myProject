package com.study.myProject.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.Api;

@Api(value = "MainController", tags = "메인 컨트롤러")
@Controller
public class MainController {

	@GetMapping("/main")
	public String test(HttpServletRequest request) {
		return "page/main";
	}
}
