package com.study.myProject.petBill.service;
import java.util.Map;


public interface PetBillSearchService {

	// ======================================= searchResult 관련 ===================================================
	
	// [검색X, 시/도 선택X, 시/구 선택X] - 전체 병원 list 개수 
	Map<String, Object> getHosList(String pageNum);
	
	// [검색O, 시/도 선택X, 시/구 선택X] - 검색한 병원 list 
	Map<String, Object> getSearchHosList(String pageNum, String search);
	
	// [검색O, 시/도 선택O, 시/구 선택O] - 선택O / 검색O 병원 list
	Map<String, Object> getSel(String pageNum, String sidoSel, String siguSel, String search);
	
}
