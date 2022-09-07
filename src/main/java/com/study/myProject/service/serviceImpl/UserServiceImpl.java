package com.study.myProject.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.study.myProject.dto.UserDTO;
import com.study.myProject.entity.Users;
import com.study.myProject.enums.EnYn;
import com.study.myProject.repository.UserRepository;
import com.study.myProject.service.UserService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;
	
	@Override
	public String userSubmit(UserDTO userDTO) {
		try {
			Users users = new Users();
			users.setId(userDTO.getId());
			users.setEmail(userDTO.getEmail());
			users.setPassword(userDTO.getPassword());
			userRepository.save(users);

		}catch(IllegalArgumentException e) {
			System.out.println("저장 에러 ------>" +  e);
			return EnYn.NO.getCode();
		}
		
		return EnYn.YES.getCode();
	}

	
}
