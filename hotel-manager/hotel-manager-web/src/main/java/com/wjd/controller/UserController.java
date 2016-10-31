package com.wjd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjd.pojo.TbUser;
import com.wjd.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/user_add")
	public void addUser(TbUser user,ModelMap map){
		map.remove("user_add_error");
		if(user != null && user.getIdCard() != null){		
			if(userService.selectByIdCard(user.getIdCard()) != null){
				map.addAttribute("user_add_error", "该身份证用户已存在");
			}else{
				userService.addUser(user);
			}
		}
	}
}
