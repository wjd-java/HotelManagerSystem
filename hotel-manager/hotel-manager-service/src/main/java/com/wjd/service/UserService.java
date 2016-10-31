package com.wjd.service;

import java.util.List;

import com.wjd.pojo.TbUser;

public interface UserService {
	void addUser(TbUser user);
	TbUser selectByIdCard(String idCard);
	List<TbUser> selectAllUser(int page,int rows);
	int selectUserCount();
}
