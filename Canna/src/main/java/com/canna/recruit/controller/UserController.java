package com.canna.recruit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.canna.recruit.propertyEditor.AuthorityPropertyEditor;
import com.canna.recruit.propertyEditor.GenderPropertyEditor;
import com.canna.recruit.user.dto.Authority;
import com.canna.recruit.user.dto.Gender;
import com.canna.recruit.user.dto.User;

@Controller
@RequestMapping(value="/user")   
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Gender.class, new GenderPropertyEditor());
		binder.registerCustomEditor(Authority.class, new AuthorityPropertyEditor());
	}
	
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinPage(@ModelAttribute("user") User user) {
		logger.info("프로젝트 칸나-회원가입 페이지");
		return "user-join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinUser(@ModelAttribute("user") User user) {
		logger.info("---------- {} 회원 정보 저장 시작----------", user.getId());
		return "user-join";
	}
	
	
}
