package com.canna.recruit.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

@Component
public class LoginFailureHandler implements AuthenticationFailureHandler {
	public static final int ITERNAL_AUTHENTICATION_ERROR = 100;
	public static final int LOGIN_FAIL_DISMATCH = 101;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginFailureHandler.class);
	
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException authenticationException)
			throws IOException, ServletException {
		int cause = 9999;
		
		if(authenticationException instanceof InternalAuthenticationServiceException) {
			logger.error("InternalAuthenticationServiceException로 인해 로그인 실패 : code{}", ITERNAL_AUTHENTICATION_ERROR);
			cause = ITERNAL_AUTHENTICATION_ERROR;
		} else if(authenticationException instanceof BadCredentialsException) {
			logger.warn("BadCredentialsException로 인해 로그인 실패 : code{}", LOGIN_FAIL_DISMATCH);
			cause = LOGIN_FAIL_DISMATCH;
		}
		
		response.sendRedirect(request.getContextPath() + "/user/login?cause=" + cause);
	}

}
