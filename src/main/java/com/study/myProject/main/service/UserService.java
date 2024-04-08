package com.study.myProject.main.service;

import java.util.Optional;

import com.study.myProject.main.dto.UserDTO;
import com.study.myProject.main.entity.UserInfo;

public interface UserService {
	
	Optional<UserInfo> idCheckService(String id);
	
	String signupSubmitService(UserDTO userDTO);
	
	UserInfo loginCheckService(String id, String password);


}
