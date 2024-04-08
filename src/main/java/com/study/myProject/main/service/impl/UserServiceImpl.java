package com.study.myProject.main.service.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.myProject.main.dto.UserDTO;
import com.study.myProject.main.entity.UserInfo;
import com.study.myProject.main.enums.EnYn;
import com.study.myProject.main.repository.UserInfoRepository;
import com.study.myProject.main.service.UserService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserInfoRepository userRepository;
	
	@Override
	public Optional<UserInfo> idCheckService(String id) {
				
		return userRepository.findById(id);
	}
	
	@Override
	public String signupSubmitService(UserDTO userDTO) {
		try {
			Optional<UserInfo> userCh = userRepository.findById(userDTO.getId());
			if(!userCh.isPresent()) { //isPresent() 값이 있으면 true
				
				UserInfo users = new UserInfo();
				users.setId(userDTO.getId());
				//users.setEmail(userDTO.getEmail());
				//users.setPassword(userDTO.getPassword());
				userRepository.save(users);
				
			}
		}catch(IllegalArgumentException e) {
			System.out.println("저장 에러 ------>" +  e);
			return EnYn.NO.getCode();
		}
		
		return EnYn.YES.getCode();
	}

	@Override
	public UserInfo loginCheckService(String id, String password) {

		return userRepository.findByIdAndPw(id ,password);
		
	}


	
}
