package com.study.myProject.service.serviceImpl;


import java.util.Optional;
import org.springframework.stereotype.Service;

import com.study.myProject.dto.UserDTO;
import com.study.myProject.entity.Users;
import com.study.myProject.enums.EnYn;
import com.study.myProject.petBill.repository.UserRepository;
import com.study.myProject.repository.PetBillUserRepository;
import com.study.myProject.service.UserService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;
	
	@Override
	public Optional<Users> idCheckService(String id) {
				
		return userRepository.findById(id);
	}
	
	@Override
	public String signupSubmitService(UserDTO userDTO) {
		try {
			Optional<Users> userCh = userRepository.findById(userDTO.getId());
			if(!userCh.isPresent()) { //isPresent() 값이 있으면 true
				
				Users users = new Users();
				users.setId(userDTO.getId());
				users.setEmail(userDTO.getEmail());
				users.setPassword(userDTO.getPassword());
				userRepository.save(users);
				
			}

		}catch(IllegalArgumentException e) {
			System.out.println("저장 에러 ------>" +  e);
			return EnYn.NO.getCode();
		}
		
		return EnYn.YES.getCode();
	}

	@Override
	public Users loginCheckService(String id, String password) {

		return userRepository.findByIdAndPassword(id ,password);
		
	}


	
}
