package com.study.myProject.petBill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("petBill/search/*")
@RequiredArgsConstructor
public class PetBillSearchController {
	
	/**
	 * mapMain page 지도 페이지
	 * */  
	@RequestMapping(value = "mapMain")
	public String mapMain() {
		return "petBill/search/mapMain";
	}
	 
	/**
	 * 서울특별시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSeoul")
	public String locSeoul(){
		return "petBill/search/loc/locSeoul";
	}
	/**
	 * 경기도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locGyeonggi")
	public String locGyeonggi() {
		return "petBill/search/loc/locGyeonggi";
	}
	/**
	 * 인천광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locIncheon")
	public String locIncheon() {
		return "petBill/search/loc/locIncheon";
	}
	/**
	 * 강원도 선택시 페이지 이동 
	 * */ 
	@RequestMapping(value = "/loc/locGangwon")
	public String locGangwon() {
		return "petBill/search/loc/locGangwon";
	}
	/**
	 * 충청남도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSouthChungcheong")
	public String locSouthChungcheong() {
		return "petBill/search/loc/locSouthChungcheong";
	}
	/**
	 * 대전광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locDaejeon")
	public String locDaejeon() {
		return "petBill/search/loc/locDaejeon";
	}
	/**
	 * 충청북도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locNorthChungchung")
	public String locNorthChungchung() {
		return "petBill/search/loc/locNorthChungchung";
	}
	/**
	 * 세종특별자치구 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSejong")
	public String locSejong() {
		return "petBill/search/loc/locSejong";
	}
	/**
	 * 부산광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locBusan")
	public String locBusan() {
		return "petBill/search/loc/locBusan";
	}
	/**
	 * 울산광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locUlsan")
	public String locUlsan() {
		return "petBill/search/loc/locUlsan";
	}
	/**
	 * 대구광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locDaegu")
	public String locDaegu() {
		return "petBill/search/loc/locDaegu";
	}
	/**
	 * 경상북도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locNorthGyeongsang")
	public String locNorthGyeongsang() {
		return "petBill/search/loc/locNorthGyeongsang";
	}
	/**
	 * 경상남도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSouthGyeongsang")
	public String locSouthGyeongsang() {
		return "petBill/search/loc/locSouthGyeongsang";
	}
	/**
	 * 전라남도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSouthJeolla")
	public String locSouthJeolla() {
		return "petBill/search/loc/locSouthJeolla";
	}
	/**
	 * 광주광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locGwangju")
	public String locGwangju() {
		return "petBill/search/loc/locGwangju";
	}
	/**
	 * 전라북도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locNorthJeolla")
	public String locNorthJeolla() {
		return "petBill/search/loc/locNorthJeolla";
	}
	/**
	 * 제주도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locJeju")
	public String locJeju(){
		return "petBill/search/loc/locJeju";
	}
	

}
