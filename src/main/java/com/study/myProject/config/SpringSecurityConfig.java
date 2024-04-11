//package com.study.myProject.config;
//
//import javax.servlet.DispatcherType;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//
//public class SpringSecurityConfig {
//	
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return new SimplePasswordEncoder();
//	}
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//		
//		http.csrf().disable().cors().disable()
//			.authorizeHttpRequests(request -> request
//					.dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
//			        .requestMatchers(new AntPathRequestMatcher("/resources/**")).permitAll()
//			        .requestMatchers(new AntPathRequestMatcher("/h2-console/**")).permitAll()
//			        .requestMatchers(new AntPathRequestMatcher("/loginProc")).permitAll()
//					.anyRequest().authenticated()// 어떠한 요청이라도 인증필요
//					
//			)
//			.formLogin(login -> login		// form 방식 로그인 사용
//					.loginPage("/login")				
//					.loginProcessingUrl("/loginCheck")
//					.usernameParameter("id")
//					.passwordParameter("pw")
//					.defaultSuccessUrl("/main", true)	// 성공 시 dashboard로
//					.permitAll()	// 대시보드 이동이 막히면 안되므로 얘는 허용
//					
//			)
//			.headers().frameOptions().sameOrigin();
////			.logout()
////			.logoutRequestMatcher(new AntPathRequestMatcher("/logoutProc")); //logoutProc 호출시 로그아웃이 된다. default : /logout
//			
//		return http.build();
//	}
//	
//
//}
