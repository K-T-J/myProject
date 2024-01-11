package com.study.myProject.df.rest;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DfApiRestTemplate {
	
	final static String KEY = "McRcElZzJFroJkfhHuEaS0J96IiRCOp8";
	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ObjectMapper objectMapper;
	
	protected RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	protected Map<String, Object> dfRestServer(String url, JsonNode bodyParams, HttpMethod httpMethod) {
		Object logHeaders = null;
		int logStatus = 0;
		Object logReqBody = null;
		Object logResBody = null;
		ResponseEntity<String> res = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		Map<String, Object> resBody = new HashMap<>();

		try {
			RestTemplate rest = new RestTemplate();
			rest.getMessageConverters().set(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));
			HttpHeaders headers = new HttpHeaders();
			headers.set("Content-Type", "application/json");

			headers.setContentType(MediaType.APPLICATION_JSON);
			logHeaders = headers;

			logReqBody = bodyParams == null ? "" : bodyParams.toString();

			HttpEntity<Object> requestEntity = new HttpEntity<>(bodyParams, headers);
			res = rest.exchange(url+KEY, httpMethod, requestEntity, String.class);
			resBody = objectMapper.readValue(res.getBody(), new TypeReference<HashMap<String, Object>>() {
			});
			logResBody = resBody;
			logStatus = res.getStatusCode().value();
		} catch (HttpClientErrorException ex) {
			log.error(ex.getMessage(), ex);
			logResBody = ex.getMessage();
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			logResBody = ex.getMessage();
		}
		log.info("[Ifhome_API] httpStatus : {}, uri=> {}, header=>{}, req_data=> {}, res_data=> {}", logStatus, url,
				logHeaders, logReqBody, logResBody);

		return resBody;
	}	
}
