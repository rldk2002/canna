package com.canna.recruit.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.canna.recruit.user.domain.Authority;
import com.canna.recruit.user.domain.Company;
import com.canna.recruit.user.domain.Personal;
import com.canna.recruit.user.service.UserService;

@Component
public class UserLoginService implements UserDetailsService {
	@Autowired private UserService userService;
	
	// 로그인 인증
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Authority authority = userService.getUserAuthority(username);

		if(authority == null) {
			throw new UsernameNotFoundException("유저를 찾을 수 없습니다. : " + username);
		} else {
			Collection<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
			roles.add(new SimpleGrantedAuthority(authority.getAuthority()));

			if(authority == Authority.PERSONAL) {
				Personal personal = userService.getPersonalUser(username);
				return new PersonalUserDetails(username, personal.getPassword(), roles, personal);
			} else if(authority == Authority.COMPANY) {
				Company company = userService.getCompanyUser(username);
				return new CompanyUserDetails(username, company.getPassword(), roles, company);
			}
		}
		
		return null;
	}
}
