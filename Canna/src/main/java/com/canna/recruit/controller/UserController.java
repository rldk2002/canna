package com.canna.recruit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.canna.recruit.propertyEditor.AuthorityPropertyEditor;
import com.canna.recruit.propertyEditor.GenderPropertyEditor;
import com.canna.recruit.user.dao.UserDao;
import com.canna.recruit.user.domain.Authority;
import com.canna.recruit.user.domain.Gender;
import com.canna.recruit.user.domain.User;

@Controller
@ComponentScan(basePackages="com.canna.recruit")
@RequestMapping(value="/user")
public class UserController {
	@Autowired() UserDao userDao;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Gender.class, new GenderPropertyEditor());
		binder.registerCustomEditor(Authority.class, new AuthorityPropertyEditor());
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinPage(@ModelAttribute("user") User user, Model model) {
		
		model.addAttribute("title", "프로젝트 칸나-회원가입");
		
		return "/template-user/user/join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinUser(@ModelAttribute("user") User user) {
		logger.info("---------- [{}] 회원 정보 저장 시작----------", user.getId());
		userDao.addPersonal(user);
		logger.info("---------- [{}] 회원 정보 저장 완료----------", user.getId());
		return "user-join";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("프로젝트 칸나-로그인");
		
		return "/template-user/user/login";
	}
	
}
