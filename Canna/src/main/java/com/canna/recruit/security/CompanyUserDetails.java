package com.canna.recruit.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.canna.recruit.user.domain.Company;

public class CompanyUserDetails extends User {
	private Company user;
	
	public CompanyUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, Company user) {
		super(username, password, authorities);
		this.user = user;
	}

	public Company getUser() {
		return user;
	}

}
