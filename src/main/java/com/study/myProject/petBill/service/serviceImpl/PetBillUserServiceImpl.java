package com.study.myProject.petBill.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.study.myProject.main.enums.EnYn;
import com.study.myProject.petBill.dto.PetBillUserDTO;
import com.study.myProject.petBill.entity.PetBillUsers;
import com.study.myProject.petBill.repository.PetBillUserRepository;
import com.study.myProject.petBill.service.PetBillUserService;

@Service
public class PetBillUserServiceImpl implements PetBillUserService{
	
	@Autowired
	private PetBillUserRepository petBillUserRepository;
	
	/**
	 * 아이디 중복 체크
	 * */
	@Override
	public Optional<PetBillUsers> idCheck(String id) {
		return petBillUserRepository.findById(id);
	}

	/**
	 * 닉네임 중복 체크
	 * */
	@Override
	public Optional<PetBillUsers> ajaxnicknamecheck(String nickname) {
		return petBillUserRepository.findByNickName(nickname);
	}

	/**
	 * 회원 가입
	 * */
	@Override
	public String userSignup(PetBillUserDTO dto) {

		try {
			PetBillUsers petBillUsers = new PetBillUsers();
			petBillUsers.setId(dto.getId());
			petBillUsers.setPw(dto.getPw());
			petBillUsers.setName(dto.getName());
			petBillUsers.setNickName(dto.getNickname());
			petBillUsers.setMobile(dto.getMobile());
			petBillUsers.setReg(LocalDateTime.now());
			petBillUserRepository.save(petBillUsers);
			
		}catch(IllegalArgumentException e) {
			
			return EnYn.NO.getCode();
			
		}
		return EnYn.YES.getCode();
	}
	/**
	 * 로그인 pro
	 * */
	@Override
	public PetBillUsers IdPwcheck(PetBillUserDTO dto) {
		
		PetBillUsers petBillusers = petBillUserRepository.findByIdAndPw(dto.getId(), dto.getPw());
		
		if(petBillusers != null) {
			//세션만들기
			RequestContextHolder.getRequestAttributes().setAttribute("userId", dto.getId(), RequestAttributes.SCOPE_SESSION);
		}
		return petBillusers;	
	}
	/**
	 * 로그아웃
	 * */
	@Override
	public void logout(String userId) {
		//세션삭제
		RequestContextHolder.getRequestAttributes().removeAttribute("userId", RequestAttributes.SCOPE_SESSION);
		
	}
	/**
	 * 세션 가져오기
	 * */
	@Override
	public String getSessionInfo() {
		
		return (String)RequestContextHolder.getRequestAttributes().getAttribute("userId", RequestAttributes.SCOPE_SESSION);
	}
	
	/**
	 * 유저 한명 데이터
	 * */
	@Override
	public PetBillUserDTO getUser(String id) {
		
		Optional<PetBillUsers> userId = petBillUserRepository.findById(id);
		PetBillUserDTO dto = new PetBillUserDTO();
		if(userId != null) {
			dto.setId(userId.get().getId());
			dto.setPw(userId.get().getPw());
			dto.setName(userId.get().getName());
			dto.setNickname(userId.get().getNickName());
			dto.setReg(userId.get().getReg());
			dto.setMobile(userId.get().getMobile());
			dto.setUseractivenum(userId.get().getUseractivenum());
			dto.setUserreason(userId.get().getUserreason());
		}else {
			dto = null;
		}

		return dto;
	}

	/**
	 * 회원 비밀번호 체크
	 * */
	@Override
	public PetBillUsers userPwCheck(String id, String pw) {
		
		return petBillUserRepository.findByIdAndPw(id,pw);

	}
	
	/**
	 * 비밀번호 수정Pro
	 * */
	@Override
	public String pwModify(String userId, String pw, String newPw) {
		
		PetBillUsers userInfo = petBillUserRepository.findByIdAndPw(userId,pw);
		if(userInfo != null) {
			userInfo.setPw(newPw);
			petBillUserRepository.save(userInfo);
			return EnYn.YES.getCode();
		}else {
			
		}
		return EnYn.NO.getCode();
	}

	/**
	 * 유저 정보 수정
	 * */
	@Override
	public String updateUser(String userId, String nickname, String mobile) {
		Optional<PetBillUsers> user= petBillUserRepository.findById(userId);
		if(user != null) {
			user.get().setNickName(nickname);
			user.get().setMobile(mobile);
			petBillUserRepository.save(user.get());
			
			return EnYn.YES.getCode();
		}
		return EnYn.NO.getCode();
	}



}
