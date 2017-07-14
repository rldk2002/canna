package com.canna.recruit.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.canna.recruit.user.domain.Personal;

public class PersonalUserDetails extends User {
	private Personal user;
	
	public PersonalUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, Personal user) {
		super(username, password, authorities);
		this.user = user;
	}

	public Personal getUser() {
		return user;
	}

}
