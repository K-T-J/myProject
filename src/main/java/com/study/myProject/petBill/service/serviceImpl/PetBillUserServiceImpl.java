package com.study.myProject.petBill.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.study.myProject.enums.EnYn;
import com.study.myProject.petBill.dto.PetBillUserDTO;
import com.study.myProject.petBill.entity.PetBillUsers;
import com.study.myProject.petBill.repository.PetBillUserRepository;
import com.study.myProject.petBill.service.PetBillUserService;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PetBillUserServiceImpl implements PetBillUserService{
	
	private final PetBillUserRepository petBillUserRepository;
	
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

}
