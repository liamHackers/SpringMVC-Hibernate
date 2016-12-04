package com.liam.service;

import com.liam.domain.User;

public interface UserServiceI {
	User Login(String userName,String passWord);
}
