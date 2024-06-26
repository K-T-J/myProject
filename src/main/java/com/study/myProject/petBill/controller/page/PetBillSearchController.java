package com.study.myProject.petBill.controller.page;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.myProject.petBill.entity.TbHospital;
import com.study.myProject.petBill.service.PetBillSearchService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("petBill/search/*")
public class PetBillSearchController {
	
	@Autowired
	private PetBillSearchService petBillSearchService;
	

	/**
	 * mapMain page 지도 페이지
	 * @return
	 */
	@RequestMapping(value = "/mapMain")
	public String mapMain(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/mapMain";
	}
	/**
	 * 서울특별시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSeoul")
	public String locSeoul(@RequestParam(name = "petType", required = true) String petType , Model model){
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locSeoul";
	}
	/**
	 * 경기도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locGyeonggi")
	public String locGyeonggi(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locGyeonggi";
	}
	/**
	 * 인천광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locIncheon")
	public String locIncheon(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locIncheon";
	}
	/**
	 * 강원도 선택시 페이지 이동 
	 * */ 
	@RequestMapping(value = "/loc/locGangwon")
	public String locGangwon(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locGangwon";
	}
	/**
	 * 충청남도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSouthChungcheong")
	public String locSouthChungcheong(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locSouthChungcheong";
	}
	/**
	 * 대전광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locDaejeon")
	public String locDaejeon(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locDaejeon";
	}
	/**
	 * 충청북도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locNorthChungchung")
	public String locNorthChungchung(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locNorthChungchung";
	}
	/**
	 * 세종특별자치구 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSejong")
	public String locSejong(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locSejong";
	}
	/**
	 * 부산광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locBusan")
	public String locBusan(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locBusan";
	}
	/**
	 * 울산광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locUlsan")
	public String locUlsan(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locUlsan";
	}
	/**
	 * 대구광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locDaegu")
	public String locDaegu(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locDaegu";
	}
	/**
	 * 경상북도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locNorthGyeongsang")
	public String locNorthGyeongsang(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locNorthGyeongsang";
	}
	/**
	 * 경상남도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSouthGyeongsang")
	public String locSouthGyeongsang(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locSouthGyeongsang";
	}
	/**
	 * 전라남도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locSouthJeolla")
	public String locSouthJeolla(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locSouthJeolla";
	}
	/**
	 * 광주광역시 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locGwangju")
	public String locGwangju(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locGwangju";
	}
	/**
	 * 전라북도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locNorthJeolla")
	public String locNorthJeolla(@RequestParam(name = "petType", required = true) String petType , Model model) {
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locNorthJeolla";
	}
	/**
	 * 제주도 선택시 페이지 이동
	 * */  
	@RequestMapping(value = "/loc/locJeju")
	public String locJeju(@RequestParam(name = "petType", required = true) String petType , Model model){
		model.addAttribute("petType", petType);
		return "petBill/search/loc/locJeju";
	}
	
	// [검색X, 시/도 선택X, 시/구 선택X] 전체 병원 리스트 
	@RequestMapping(value= "/searchResult")		// searchResult.pet?pageNum=
	public String searchResult(HttpServletRequest request, String pageNum, String sidoSel, String siguSel, String search, Model model)  {
		// 해당 페이지에 맞는 화면에 뿌려줄 병원 list 가져와 view에 전달 
//		Map<String, Object> result = null;
//		System.out.println("sidoSel : " + sidoSel);
//		System.out.println("siguSel :" + siguSel);
//		System.out.println("search :" + search);
//		Page<TbHospital> sel = petBillSearchService.getSel(pageNum, sidoSel, siguSel, search);
//		
//		Map<String, Object> reviewListCount = null;
//		reviewListCount = searchService.getRevListCount(hosNo);
		
//		// [검색X, 시/도 선택X, 시/구 선택X]     
//		if (search == null && siguSel == null || sidoSel == null) {			// 검색X 시/도,구 선택X    
//			System.out.println("1111111111111111111");
//			result = searchService.getHosList(pageNum);
//		}
//		// [검색O, 시/도 선택X, 시/구 선택X] - 검색한 병원 list 
//		if (search != null) {												// 검색O
//			System.out.println("222222222222222222222");
//			result = searchService.getSearchHosList(pageNum, search);
//		}
//		// [검색X, 시/도 선택O, 시/구 선택O] - 선택 / 검색한 병원 list 
//		if (siguSel != null || sidoSel != null) {							// 시/도,구 선택O
//			System.out.println("3333333333333333333333");
//			
//			result = searchService.getSelHosList(pageNum, sidoSel, siguSel);
//		} 
		
	
		
//		// view에 전달할 데이터 보내기 
//		model.addAttribute("pageSize", 10);
//		model.addAttribute("pageNum", 0);
//		model.addAttribute("currentPage", 0);
//		model.addAttribute("startRow", 0);
//		model.addAttribute("endRow", 0);
//		model.addAttribute("hosList", sel.getContent());
//		model.addAttribute("count", 1);
//		model.addAttribute("number", 0);
//		// petType 추가 : 혜란
//		String petType = (String)request.getParameter("petType");
//		model.addAttribute("petType", petType);
//		
//		model.addAttribute("search", search);
		model.addAttribute("sidoSel", sidoSel);	// 시/도 (부모) 파라미터 값 
		model.addAttribute("siguSel", siguSel);	// 시/구 (자식) 파라미터 값 
		
	    return "/petBill/search/searchResult";
	}

}
