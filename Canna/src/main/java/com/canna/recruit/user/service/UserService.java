package com.canna.recruit.user.service;

import com.canna.recruit.user.domain.Authority;
import com.canna.recruit.user.domain.Company;
import com.canna.recruit.user.domain.Personal;

public interface UserService {
	public Authority getUserAuthority(String id);
	public Personal getPersonalUser(String id);
	public Company getCompanyUser(String id);
	public void addPersonalUser(Personal user);
	public void addCompanyUser(Company user);
}
