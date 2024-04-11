//package com.study.myProject.config;
//
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//public class SimplePasswordEncoder implements PasswordEncoder{
//
//	/*
//	 * 해당 암호화 방식으로 암호화한 문자열을 리턴하준다. 회원 가입시 DB에 넣기 전에 호출해 암호화해야한다.
//	 * */
//	@Override
//	public String encode(CharSequence rawPassword) {
//		// TODO Auto-generated method stub
//		return rawPassword.toString();
//	}
//
//	
//	/*
//	 * rawPassword : 로그인 시 사용자가 입력한 비밀번호
//	 * encodedPassword : DB에서 조회한 이미 암호화되어있는 비밀번호
//	 * loadUserByUsername에서 UserDetails에 넣어준 password() 부분이 여기로 들어온다.
//	 * 
//	 * */
//	@Override
//	public boolean matches(CharSequence rawPassword, String encodedPassword) {  
//		return encodedPassword.equals(rawPassword);								 
//	}
//
//}
