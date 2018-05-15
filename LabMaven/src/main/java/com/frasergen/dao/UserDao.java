package com.frasergen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frasergen.entity.User;

public interface UserDao {
	
	public int addUser(User user);
	
	public User queryUserById(int user_id);
	
	public List<User> querylikeUser(@Param(value="name") String name,@Param(value="email")String email);
	
	public List<User> queryAllUser();
	
	public int updateUser(User user);
	
	public int delUser(int user_id);
	
	
}
