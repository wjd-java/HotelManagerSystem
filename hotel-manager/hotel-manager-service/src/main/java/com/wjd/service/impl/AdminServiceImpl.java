package com.wjd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjd.mapper.TbAdminMapper;
import com.wjd.pojo.TbAdmin;
import com.wjd.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private TbAdminMapper adminMapper;
	
	public void setAdminMapper(TbAdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}


	@Override
	public TbAdmin getAdminByUsername(String username) {
		TbAdmin admin = adminMapper.selectByUsername(username);
		return admin;
	}

}
