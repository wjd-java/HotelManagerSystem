package com.wjd.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjd.common.pojo.PagingQuery;
import com.wjd.mapper.TbUserMapper;
import com.wjd.pojo.TbUser;
import com.wjd.pojo.TbUserExample;
import com.wjd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper userMapper;
	
	@Override
	public void addUser(TbUser user) {
		userMapper.insert(user);
	}

	@Override
	public TbUser selectByIdCard(String idCard) {
		return userMapper.selectByPrimaryKey(idCard);
	}

	@Override
	public List<TbUser> selectAllUser(int page,int rows) {
		PagingQuery pq = new PagingQuery();
		int num = 0;
		if(page == 1) num = 0;
		else num = (page-1)*rows;
		pq.setNums(num);
		pq.setRows(rows);
		List<TbUser> users = new ArrayList<>();
		users = userMapper.selectByPagingQuery(pq);
		return users;
	}

	@Override
	public int selectUserCount() {
		TbUserExample example  = new TbUserExample();
		return userMapper.countByExample(example);
	}

	
}
