package com.liam.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liam.dao.UserDaoI;
import com.liam.domain.User;

@Repository
public class UserDaoImpl implements UserDaoI {
	
	
	private SessionFactory sessionFactory;
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User Login(String userName, String passWord) {
		Query query = sessionFactory.getCurrentSession().createQuery("from User a where a.username=? and a.password=?");
		query.setString(0, userName);
		query.setString(1, passWord);
		List<User> lUsers = query.list();
		if (lUsers.size()!=0) {
			return lUsers.get(0);
		}else {
			return null;
		}
	}

}
