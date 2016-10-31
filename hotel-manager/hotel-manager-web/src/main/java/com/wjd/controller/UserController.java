package com.wjd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wjd.common.pojo.DataGridResult;
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
	
	@RequestMapping("/selectAllUser")
	public String findAllUser(@RequestParam("page") int page,@RequestParam("rows") int rows,ModelMap map){
		System.out.println(page);
		List<TbUser> users = new ArrayList<>();
		users = userService.selectAllUser(page,rows);
		DataGridResult result = new DataGridResult();
		int total = userService.selectUserCount();
		int totalPage = (total-1)/rows+1;
		result.setPage(page);
		result.setTotal(total);
		result.setRows(users);
		result.setTotalPage(totalPage);
		System.out.println(result.getTotal());
		System.out.println(result.getRows());
		map.addAttribute("result",result);
		return "find_alluser";
	}
}
