package com.liam.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liam.domain.User;
import com.liam.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {
	
	private UserServiceI userServiceI;
	@Resource
	public void setUserServiceI(UserServiceI userServiceI) {
		this.userServiceI = userServiceI;
	}

	@RequestMapping(value="/Login")
	public String Login(User user,HttpServletRequest request){
		User user2 = userServiceI.Login(user.getUsername(), user.getPassword());
		if(user2!=null){
			return "/index.jsp";
		}
		return "/login.jsp";
	}
}
