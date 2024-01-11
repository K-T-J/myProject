package com.study.myProject.df.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.study.myProject.df.dto.ResApiCharacterInfoVM;

@RestController
public class DfMainResource extends DfApiRestTemplate{
	
	@Autowired
	private ObjectMapper objectMapper;
    
	@GetMapping("/api/get/df/searchInfo")
	public ResponseEntity<Object> searchInfo( 
			@RequestParam(name = "serverId", required = true, defaultValue = "all") String serverId,
			@RequestParam(name = "characterName", required = true, defaultValue = "") String characterName
	) {
		try {
			
			String url = "https://api.neople.co.kr/df/servers/"+serverId+"/characters?characterName="+characterName+"&apikey=";
			ObjectNode reqNode = objectMapper.createObjectNode();
			reqNode.put("serverId", serverId);
			reqNode.put("characterName", characterName);
			
			
			Map<String, Object> resBody = dfRestServer(url, reqNode, HttpMethod.GET);
			ResApiCharacterInfoVM resApiCharacterInfoVM = objectMapper.convertValue(resBody, ResApiCharacterInfoVM.class);
			return new ResponseEntity<>(resApiCharacterInfoVM, HttpStatus.OK);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
