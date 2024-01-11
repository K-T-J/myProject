package com.study.myProject.df.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.study.myProject.df.dto.ResApiServerIdVM;
import com.study.myProject.df.rest.DfApiRestTemplate;
import io.swagger.annotations.Api;

@Api(value = "DfMainController", tags = "DF메인 컨트롤러")
@Controller
@RequestMapping(value = "df/*")
public class DfMainController extends DfApiRestTemplate{
	
	@Autowired
	private ObjectMapper objectMapper;

	@GetMapping("main")
	public String dfMain(Model model) {
		String url = "https://api.neople.co.kr/df/servers?apikey=";
		Map<String, Object> resBody = dfRestServer(url, null, HttpMethod.GET);
		ResApiServerIdVM convertValue = objectMapper.convertValue(resBody, ResApiServerIdVM.class);
		model.addAttribute("serverId", convertValue);
		return "df/dfMain";
	}
	
	

}
