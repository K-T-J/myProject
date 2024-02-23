package com.study.myProject.df.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.study.myProject.df.dto.ResApiCharacterInfoVM;
import com.study.myProject.df.dto.ResApiCharacterInfoVM.Row;
import com.study.myProject.df.dto.ResApiCharacterItemVM;
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
	
	@GetMapping("characterDetail")
	public String characterDetail( 
		@RequestParam(name = "serverId", required = true) String serverId,
		@RequestParam(name = "characterId", required = true) String characterId,
		Model model
	) {
		//캐릭터 정보
		String characterInfoUrl = "https://api.neople.co.kr/df/"+serverId+"/prey/characters/"+characterId+"?apikey=";
		Map<String, Object> characterInfoBody = dfRestServer(characterInfoUrl, null, HttpMethod.GET);
		Row characterInfo = objectMapper.convertValue(characterInfoBody, ResApiCharacterInfoVM.Row.class);
		model.addAttribute("characterInfo", characterInfo);
		
		//캐릭터 장비
		String characterItemUrl = "https://api.neople.co.kr/df/servers/"+serverId+"/characters/"+characterId+"/equip/equipment?apikey=";
		Map<String, Object> characterItemBody = dfRestServer(characterItemUrl, null, HttpMethod.GET);
		ResApiCharacterItemVM characterItemInfo = objectMapper.convertValue(characterItemBody, ResApiCharacterItemVM.class);
		model.addAttribute("characterItemInfo", characterItemInfo);
		
		//다중 아이템 상세 정보 조회
		List<String> itemIdList = characterItemInfo.getEquipment().stream().map(el->el.getItemId()).collect(Collectors.toList());
		String itemIdStringList = itemIdList.toString();
		String multiItemUrl = "https://api.neople.co.kr/df/multi/items?itemIds="+itemIdStringList+"&apikey=";
		Map<String, Object> multiItemBody = dfRestServer(multiItemUrl, null, HttpMethod.GET);
		//ResApiCharacterItemVM characterItemInfo = objectMapper.convertValue(multiItemBody, ResApiCharacterItemVM.class);
		
		return "df/characterDetail";
	}
	
	

}
