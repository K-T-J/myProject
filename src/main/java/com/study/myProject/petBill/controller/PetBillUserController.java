package com.study.myProject.petBill.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "petBill/user/*")
public class PetBillUserController {

	@GetMapping(value = "main")		//쿠키
	public String main(HttpSession session,HttpServletRequest request) {
		//----------------쿠키------------
//		if(session.getAttribute("userId") == null) {//세션이 없을때
//			//쿠키 있는지 확인
//			UserDTO dto = new UserDTO();
//			String auto = null;
//			Cookie[] cookie = request.getCookies();//쿠키 꺼내기
//			if(cookie != null) { //쿠키값이 있다면 실행
//				System.out.println("메인쿠키");
//				System.out.println("cookie : " + cookie);
//				for(Cookie c : cookie) {
//					if(c.getName().equals("autoid")) {dto.setId(c.getValue());}
//					if(c.getName().equals("autopw")) {dto.setPw(c.getValue());}
//					if(c.getName().equals("autoch")) {auto = c.getValue();}
//				}
//			}
//			System.out.println("dtoid : "+dto.getId());
//			System.out.println("dtopw : "+dto.getPw());
//			System.out.println("auto : "+ auto);
//			//세션은 없지만, 쿠키가 있어서 위 코드로 값을 꺼내 담아보고,
//			//만약에 세 변수에 값이 들어있으면 session만들어 주기 위해서 loginPro로 이동시키기
//			if(dto.getId() != null && dto.getPw() != null && auto != null) {
//				System.out.println("여기는?");
//				return "redirect:/user/loginPro.pet"; //loginPro로 이동
//			}
//		}
		return "petBill/user/main";
	}	
	//로그인 form
	@RequestMapping("loginForm")
	public String loginForm() {
		
		return "petBill/user/loginForm";
	}	
	
	//회원가입 form
	@RequestMapping("userSignupForm")
	public String userSignupForm() {//Model model,@RequestParam Map<String, Object> Map
		
		
//		model.addAttribute("id",Map.get("id"));
//		model.addAttribute("pw",Map.get("pw"));//카카오 에서 넘어온 id를 password와 id에 넣을예정
		
		return "petBill/user/userSignupForm";
	}	
	
	
	//ajax 아이디 중복
//	@RequestMapping("ajaxidcheck")
//	public String ajaxidcheck(UserDTO dto){
//		int result = UserService.idCheck(dto);
//		
//		String data="";
//		if(result ==1) {
//			data = "이미 사용중인 아이디";
//		}else {
//			data = "사용 가능한 아이디";
//		}
//		
//		HttpHeaders respHeaders = new HttpHeaders();
//		respHeaders.add("Content-Type", "text/html;charset=UTF-8");//한글깨짐
//		
//		return "";
//	}
	
	
	
	
	
	
	
	
	
	
}
