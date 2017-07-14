package com.canna.recruit.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.canna.recruit.user.dao.UserDao;
import com.canna.recruit.user.domain.Authority;
import com.canna.recruit.user.domain.Company;
import com.canna.recruit.user.domain.Personal;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired private UserDao userDao;
	private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	
	@Override
	public Authority getUserAuthority(String id) {
		return userDao.selectAuthority(id);
	}

	@Override
	public Personal getPersonalUser(String id) {
		return userDao.selectPersonal(id);
	}

	@Override
	public Company getCompanyUser(String id) {
		return userDao.selectCompany(id);
	}

	@Override
	public void addPersonalUser(Personal user) {
		user.setPassword(encryptionBCrypt(user.getPassword()));
		userDao.insertPersonal(user);
	}

	@Override
	public void addCompanyUser(Company user) {
		user.setPassword(encryptionBCrypt(user.getPassword()));
		userDao.insertCompany(user);
	}
	
	// BCrypt 암호화
	private String encryptionBCrypt(String password) {
		return bCryptPasswordEncoder.encode(password);
	}
}
