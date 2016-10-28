package com.wjd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjd.pojo.TbUser;
import com.wjd.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user_add")
	public void addUser(TbUser user){
		System.out.println(user.getIdCard()+ user.getName());
		if(user != null && user.getIdCard() != null){
			userService.addUser(user);
		}
		
	}
}
