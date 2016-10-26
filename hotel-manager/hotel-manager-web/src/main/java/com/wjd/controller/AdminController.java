package com.wjd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wjd.pojo.TbAdmin;
import com.wjd.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}


	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap map){
		System.out.println(username+" "+password);
		TbAdmin admin = adminService.getAdminByUsername(username);
		if(admin == null){
				map.addAttribute("error","账号不存在");
				return "login";
		}else if(!(admin.getAdminPassword().equals(password))){
			map.addAttribute("error","密码错误");
			return "login";
		}
		map.addAttribute("permissions",admin.getPermissions());
		return "index";
	}
}
