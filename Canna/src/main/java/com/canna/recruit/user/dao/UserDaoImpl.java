package com.canna.recruit.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.canna.recruit.user.domain.Authority;
import com.canna.recruit.user.domain.Company;
import com.canna.recruit.user.domain.Personal;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertPersonal(Personal user) {
		logger.info("개인 회원 추가 : {}", user.getId());
		sqlSession.insert("UserDao.insertPersonal", user);
	}

	@Override
	public Personal selectPersonal(String id) {
		return sqlSession.selectOne("UserDao.selectPersonal", id);
	}

	@Override
	public void insertCompany(Company user) {
		logger.info("기업 회원 추가 : {}", user.getId());
		sqlSession.insert("UserDao.insertCompany", user);
	}

	@Override
	public Company selectCompany(String id) {
		return sqlSession.selectOne("UserDao.selectCompany", id);
	}

	@Override
	public Authority selectAuthority(String id) {
		return sqlSession.selectOne("UserDao.selectAuthority", id);
	} 
}
