package com.canna.recruit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.canna.recruit.propertyEditor.AuthorityPropertyEditor;
import com.canna.recruit.propertyEditor.GenderPropertyEditor;
import com.canna.recruit.security.User;
import com.canna.recruit.user.domain.Authority;
import com.canna.recruit.user.domain.Company;
import com.canna.recruit.user.domain.Gender;
import com.canna.recruit.user.domain.Personal;
import com.canna.recruit.user.service.UserService;

@Controller
@ComponentScan(basePackages="com.canna.recruit")
@RequestMapping(value="/user")
public class UserController {
	@Autowired private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Gender.class, new GenderPropertyEditor());
		binder.registerCustomEditor(Authority.class, new AuthorityPropertyEditor());
	}
	
	@PreAuthorize("isAnonymous()")
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinPage(@ModelAttribute("personal") Personal personal, @ModelAttribute("company") Company company, Model model) {
		
		model.addAttribute("title", "프로젝트 칸나-회원가입");
		
		return "/template-user/user/join";
	}
	
	@PreAuthorize("isAnonymous()")
	@RequestMapping(value = "/join/personal", method = RequestMethod.POST)
	public String joinPersonal(@ModelAttribute("personal") Personal user) {
		logger.info("---------- [{}] 회원 정보 저장 시작----------", user.getId());
		
		userService.addPersonalUser(user);
		
		logger.info("---------- [{}] 회원 정보 저장 완료----------", user.getId());
		return "redirect:/";
	}
	
	@PreAuthorize("isAnonymous()")
	@RequestMapping(value = "/join/company", method = RequestMethod.POST)
	public String joinCompany(@ModelAttribute("company") Company user) {
		logger.info("---------- [{}] 회원 정보 저장 시작----------", user.getId());
		
		userService.addCompanyUser(user);
		
		logger.info("---------- [{}] 회원 정보 저장 완료----------", user.getId());
		return "redirect:/";
	}
	
	@PreAuthorize("isAnonymous()")
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("user") User user, Model model) {
		
		model.addAttribute("title", "프로젝트 칸나-로그인");
		
		return "/template-user/user/login";
	}
	
}
