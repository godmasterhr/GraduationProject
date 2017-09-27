package cn.e_mall.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e_mall.manage.mapper.UserMapper;
import cn.e_mall.manage.pojo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public List<User> findUserList(int page) {
		int row = 7;
		int start = (page-1)*row;
		return userMapper.findUserList(start, row);
	}

	@Override
	public void delUserById(String userId) {
		userMapper.delUserById(userId);
	}

}
