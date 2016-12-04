package com.liam.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liam.dao.UserDaoI;
import com.liam.domain.User;
import com.liam.service.UserServiceI;

@Service
public class UserServiceImpl implements UserServiceI{
	
	private UserDaoI userDaoI;
	
	@Resource
	public void setUserServiceI(UserDaoI userDaoI) {
		this.userDaoI = userDaoI;
	}

	@Override
	public User Login(String userName, String passWord) {
		
		return userDaoI.Login(userName, passWord);
	}

}
