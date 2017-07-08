package com.canna.recruit.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.canna.recruit.user.domain.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void addPersonal(User user) {
		sqlSession.insert("UserDao.addPersonal", user);
	} 
}
