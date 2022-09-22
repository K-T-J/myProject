package com.study.myProject.component;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;



@Component
public class SessionManager { //세션 쿠키 : 브라우저를 종료하면 로그아웃
	
	private static final String SESSION_COOKIE_NAME = "userId";
	
	private Map<String, Object> sessionStore = new ConcurrentHashMap<String, Object>();
	//ConcurrentHashMap : HashMap 은 동시 요청에 안전하지 않다. 동시 요청에 안전한 ConcurrentHashMap를 사용
	
	/**
	 * 
	 * 세션 생성
	 * 
	 * */
	public void createSession(Object value, HttpServletResponse response) {
		//세션 id를 생성하고, 값을 세션에 저장
		String sessionId = UUID.randomUUID().toString();
		sessionStore.put(sessionId, value);
		
		//쿠키 생성
		Cookie mySessionCookie = new Cookie(SESSION_COOKIE_NAME, sessionId);
		response.addCookie(mySessionCookie);
	}
	
	
	/**
	 * 
	 * 세션 조회
	 * 
	 * */
	public Object getSession(HttpServletRequest request) {
		
		Cookie sessionCookie = findCookie(request, SESSION_COOKIE_NAME);
		
		if(sessionCookie == null) {
			return null;
		}
		return sessionStore.get(sessionCookie.getValue());
		
	}
	
	/**
	 * 
	 * 세션 만료
	 * 
	 * */
	public void expire(HttpServletRequest request) {
		Cookie sessionCookie = findCookie(request, SESSION_COOKIE_NAME);
		if(sessionCookie != null) {
			sessionStore.remove(sessionCookie.getValue());
		}
	}
	
	private Cookie findCookie(HttpServletRequest request, String cookieName) {
		return Arrays.stream(request.getCookies())
				.filter(cookie -> cookie.getName().equals(cookieName))
				.findAny()
				.orElse(null);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
