package com.canna.recruit.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginSuccessHandler.class);
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		logger.info("로그인 성공 // 유저아이디 : {}, 권한등급 : {}", authentication.getName(), authentication.getAuthorities().toString());
		response.sendRedirect(request.getContextPath() + "/");
	}

}
