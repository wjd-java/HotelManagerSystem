package com.wjd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjd.mapper.TbUserMapper;
import com.wjd.pojo.TbUser;
import com.wjd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper userMapper;
	
	@Override
	public void addUser(TbUser user) {
		userMapper.insert(user);
	}

}
