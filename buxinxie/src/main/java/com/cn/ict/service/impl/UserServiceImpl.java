package com.cn.ict.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.ict.dao.UserMapper;
import com.cn.ict.pojo.User;
import com.cn.ict.service.UserService;


@Service ("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper useMapper;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.useMapper.selectByPrimaryKey(userId);
	}
}
