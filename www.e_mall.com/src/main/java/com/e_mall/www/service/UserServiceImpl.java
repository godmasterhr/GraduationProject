package com.e_mall.www.service;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_mall.www.mapper.UserMapper;
import com.e_mall.www.pojo.User;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * ajax检测用户名是否存在
	 * @return
	 */
	public User findUserByUserName(String userName){
		return userMapper.findUserByUserName(userName);
		
	}
	/**
	 * 新增用户
	 */
	public void saveUser(User user){
		user.setUserId(UUID.randomUUID().toString());
		userMapper.saveUser(user);
	}
	/**
	 * 用户登录
	 */
	public User findUserByUP(User user) {
		return userMapper.findUserByUP(user);
	}
	/**
	 * 更新用户
	 */
	public void updateUser(User user){
		userMapper.updateUser(user);
	}
}
