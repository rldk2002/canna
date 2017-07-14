package com.canna.recruit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.canna.recruit.security.LoginFailureHandler;
import com.canna.recruit.security.LoginSuccessHandler;
import com.canna.recruit.security.LogoutSuccessHandler;
import com.canna.recruit.security.UserLoginService;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired private UserLoginService userLoginService;
	@Autowired private LoginSuccessHandler loginSuccessHandler;
	@Autowired private LoginFailureHandler loginFailureHandler;
	@Autowired private LogoutSuccessHandler louLogoutSuccessHandler;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		configureLogin(http);
		configureLogout(http);
		
	}
	
	protected void configureLogin(HttpSecurity http) throws Exception {
		http
			.formLogin()
				.loginPage("/user/login")
				.loginProcessingUrl("/user/login")
				.usernameParameter("username")
				.passwordParameter("password")
				.successHandler(loginSuccessHandler)
				.failureHandler(loginFailureHandler);
	}
	
	protected void configureLogout(HttpSecurity http) throws Exception {
		http
			.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
				.invalidateHttpSession(true)
				.logoutSuccessHandler(louLogoutSuccessHandler);
	}

	@Override
	protected UserDetailsService userDetailsService() {
		return userLoginService;
	}
	
	@Override 
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
		auth.userDetailsService(userDetailsService()).passwordEncoder(bCryptPasswordEncoder); 
	}
	
}
