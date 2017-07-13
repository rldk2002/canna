package com.canna.recruit.user.dao;

import com.canna.recruit.user.domain.Authority;
import com.canna.recruit.user.domain.Company;
import com.canna.recruit.user.domain.Personal;

public interface UserDao {
	public void insertPersonal(Personal user);
	public Personal selectPersonal(String id);
	public void insertCompany(Company user);
	public Company selectCompany(String id);
	public Authority selectAuthority(String id);
}
