//package com.study.myProject.main.service.impl;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.study.myProject.main.entity.UserInfo;
//import com.study.myProject.main.repository.UserInfoRepository;
//
//@Service
//public class LoginIdPwValidator implements UserDetailsService{
//	
//	@Autowired
//	private UserInfoRepository userRepository;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Optional<UserInfo> userInfo = userRepository.findById(username);
//		if(!userInfo.isPresent()) new UsernameNotFoundException("없는 회원");
//		UserInfo user = userInfo.get();
//		
//		return User.builder()
//					.username(user.getId())
//					.password(user.getPw())
//					.roles("user")
//					.build();
//	}
//	
//	
//
//}
