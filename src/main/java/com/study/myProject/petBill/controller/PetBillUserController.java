package com.study.myProject.petBill.controller;

import java.sql.SQLException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.myProject.enums.EnYn;
import com.study.myProject.petBill.dto.PetBillUserDTO;
import com.study.myProject.petBill.entity.PetBillUsers;
import com.study.myProject.petBill.service.PetBillUserService;


import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "petBill/user/*")
public class PetBillUserController {
	
	private final PetBillUserService petBillUserService;

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
		
		//임시 데이터
		PetBillUserDTO dto = new PetBillUserDTO();
		dto.setId("java");
		dto.setPw("1234");
		dto.setName("java");
		dto.setNickname("java");
		dto.setMobile("123-456-6786");
		
		petBillUserService.userSignup(dto);
		
		PetBillUserDTO admin = new PetBillUserDTO();
		admin.setId("admin");
		admin.setPw("1234");
		admin.setName("admin");
		admin.setNickname("admin");
		admin.setMobile("123-456-6786");
		
		petBillUserService.userSignup(admin);
		
		return "petBill/user/main";
	}	
	/**
	 * 로그인 form
	 * */
	@GetMapping(value = "loginForm")
	public String loginForm() {
		
		return "petBill/user/loginForm";
	}	
	
	/**
	 * 회원가입 form
	 * */
	@GetMapping(value = "userSignupForm")
	public String userSignupForm() {//Model model,@RequestParam Map<String, Object> Map
		
		
//		model.addAttribute("id",Map.get("id"));
//		model.addAttribute("pw",Map.get("pw"));//카카오 에서 넘어온 id를 password와 id에 넣을예정
		
		return "petBill/user/userSignupForm";
	}	
	
	
	/**
	 * ajax 아이디 중복
	 * */
	@ResponseBody
	@PostMapping(value = "ajaxidcheck")
	public Optional<PetBillUsers> ajaxidcheck(String id){
		
		return petBillUserService.idCheck(id);
	}
	
	/**
	 * ajax 닉네임 중복
	 * */
	@ResponseBody
	@PostMapping(value = "ajaxnicknamecheck")
	public Optional<PetBillUsers> ajaxnicknamecheck(String nickname){

		return petBillUserService.ajaxnicknamecheck(nickname);
	}
	
	/**
	 * 회원가입 pro
	 * */
	@ResponseBody
	@PostMapping(value = "userSignupPro")
	public String userSignupPro(PetBillUserDTO dto) throws SQLException{

		String result = petBillUserService.userSignup(dto);
	
		return result;
	}
	
	/**
	 * 로그인 pro
	 * */
	@ResponseBody
	@PostMapping(value = "loginPro")											//쿠키
	public String loginPro(PetBillUserDTO dto, String auto, Model model, HttpServletResponse response, HttpServletRequest request){
		
		//--------------쿠키------------------------
		//main에서 왔으면 dto값이 없을것이다.
//		Cookie[] cookie = request.getCookies();
//		System.out.println("여기왔나?");
//		if(cookie != null) {
//			System.out.println("쿠키값이 null이 아닐때");
//			for(Cookie c : cookie) {
//				if(c.getName().equals("autoid")) {dto.setId(c.getValue());}
//				if(c.getName().equals("autopw")) {dto.setPw(c.getValue());}
//				if(c.getName().equals("autoch")) {auto = c.getValue();}
//			}
//		}
		
		//일반회원 id,pw 체크
		PetBillUsers petBilluser = petBillUserService.IdPwcheck(dto);

		if(petBilluser == null) {
			return EnYn.NO.getCode();
		}
		
		
//		if(result == 1) {//로그인 체크가 됐을때
//			if(auto != null) {//자동 로그인을 눌렀을때
//				System.out.println("쿠키생성");
//				//쿠키 생성
//				Cookie c1 = new Cookie("autoid", dto.getId());
//				Cookie c2 = new Cookie("autopw", dto.getPw());
//				Cookie c3 = new Cookie("autoch", auto);
//				c1.setMaxAge(60*60*24);//24시간
//				c2.setMaxAge(60*60*24);//24시간
//				c3.setMaxAge(60*60*24);//24시간
//				response.addCookie(c1);
//				response.addCookie(c2);
//				response.addCookie(c3);
//			}
//		}
		
		//--------------쿠키------------------------
		//view로 보내기
//		model.addAttribute("result",result);
		
		return EnYn.YES.getCode();
	}
	
	/**
	 * 로그아웃
	 * */
	@RequestMapping(value = "logoutPro")							//쿠키
	public String logoutPro(HttpSession session, Model model,HttpServletRequest request,HttpServletResponse response) {
		
			//session.invalidate();
			petBillUserService.logout("userId");//일반유저 세션삭제
			// 쿠키 삭제
//			Cookie[] cookie = request.getCookies();
//			if(cookie != null) {//쿠키 값이 있으면
//				System.out.println("쿠키 삭제돼라");
//				for(Cookie c : cookie) {
//					if(c.getName().equals("autoid") || c.getName().equals("autopw")||c.getName().equals("autoch")) {
//						c.setMaxAge(0);
//						response.addCookie(c);
//					}
//				}
//			}
		
		return "redirect:/petBill/user/main";
	}
	
	/**
	 * 마이페이지
	 * */
	@GetMapping(value = "userMypage")
	public String userMypage(Model model,HttpSession session) throws SQLException{
		
		PetBillUserDTO dto = new PetBillUserDTO();
		
		if(session.getAttribute("userId") != null) {
			//유저 1명정보 가져오기
			String userId = petBillUserService.getSessionInfo();
			dto = petBillUserService.getUser(userId);
		}else if(session.getAttribute("kakaoId") != null){
			//String id = (String)session.getAttribute("kakaoId");
			//DB카카오 유저 정보 가져오기
			//dto = petBillUserService.getkakao(id);
		}
		model.addAttribute("dto", dto);
		
		return "petBill/user/userMypage";
	}
	
	/**
	 * 유저 정보 수정 Form
	 * */
	@GetMapping(value = "userModifyForm")
	public String userModifyForm (Model model, HttpSession session) throws SQLException{
		
		PetBillUserDTO dto = null;
		
		if(session.getAttribute("userId") != null) {
			//유저 1명정보 가져오기
			String userId = petBillUserService.getSessionInfo();
			dto = petBillUserService.getUser(userId);
		}else {
//			String id = (String)session.getAttribute("kakaoId");
//			//DB카카오 유저 정보 가져오기
//			dto = petBillUserService.getkakao(id);
		}
		model.addAttribute("dto", dto);
		
		return "petBill/user/userModifyForm";
	}	
	
	/**
	 * 비밀번호 수정Form
	 * */
	@RequestMapping(value = "pwModifyForm")
	public String pwModifyForm() {
		
		return "petBill/user/pwModifyForm";
	}
	
	/**
	 * 비밀번호 체크
	 * */
	@ResponseBody
	@PostMapping(value = "pwCheck")
	public String pwCheck(String pw, HttpSession session) {
		
		String userId = petBillUserService.getSessionInfo();
		PetBillUsers user = petBillUserService.userPwCheck(userId, pw);
		
		if(user == null) {
			return EnYn.NO.getCode();
		}
		return EnYn.YES.getCode();
	}
	/**
	 * 비밀번호 수정Pro
	 * */
	@ResponseBody
	@RequestMapping("pwModiFyPro")
	public String pwModiFyPro(HttpServletRequest request, HttpServletResponse response, 
			HttpSession session, String pw,String newPw) throws SQLException{
		String userId = petBillUserService.getSessionInfo();
		String result = petBillUserService.pwModify(userId,pw,newPw);
//		if(result == 1) {
//			// 쿠키 삭제
//			Cookie[] cookie = request.getCookies();
//			if(cookie != null) {//쿠키 값이 있으면
//				System.out.println("쿠키 삭제돼라");
//				for(Cookie c : cookie) {
//					if(c.getName().equals("autoid") || c.getName().equals("autopw")||c.getName().equals("autoch")) {
//						c.setMaxAge(0);
//						response.addCookie(c);
//					}
//				}
//			}
//		}
				
		return result;
	}
	
}
