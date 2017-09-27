package cn.e_mall.manage.service;

import java.util.List;

import cn.e_mall.manage.pojo.User;

public interface UserService {
	
	public List<User> findUserList(int page);

	public void delUserById(String userId);
}
