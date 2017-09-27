package com.e_mall.www.service;

import com.e_mall.www.pojo.User;

public interface UserService {
	/**
	 * ajax检测用户名是否存在
	 * @return
	 */
	public User findUserByUserName(String userName);
	/**
	 * 新增用户
	 */
	public void saveUser(User user);
	/**
	 * 用户登录
	 */
	public User findUserByUP(User user);
	/**
	 * 更新用户
	 */
	public void updateUser(User user);
}
