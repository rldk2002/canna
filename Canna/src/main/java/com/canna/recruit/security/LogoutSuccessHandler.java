package com.canna.recruit.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class LogoutSuccessHandler implements org.springframework.security.web.authentication.logout.LogoutSuccessHandler {

	private static final Logger logger = LoggerFactory.getLogger(LogoutSuccessHandler.class);
	
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		
		logger.info("로그아웃 성공 // 유저아이디 : {}", authentication.getName());
		response.sendRedirect(request.getContextPath() + "/");
	}

}
