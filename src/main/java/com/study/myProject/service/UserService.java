package com.study.myProject.service;

import java.util.Optional;

import com.study.myProject.dto.UserDTO;
import com.study.myProject.entity.Users;

public interface UserService {
	
	Optional<Users> idCheckService(String id);
	
	String signupSubmitService(UserDTO userDTO);
	
	Users loginCheckService(String id, String password);


}
