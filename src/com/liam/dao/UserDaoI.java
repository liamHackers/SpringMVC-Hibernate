package com.liam.dao;

import com.liam.domain.User;

public interface UserDaoI {
	User Login(String userName,String passWord);
}
