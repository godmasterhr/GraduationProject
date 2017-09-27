package cn.e_mall.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.e_mall.manage.pojo.User;

public interface UserMapper {

	public List<User> findUserList(@Param("start") int start,@Param("row") int row);

	public void delUserById(String userId); 
}
