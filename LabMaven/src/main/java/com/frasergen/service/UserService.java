package com.frasergen.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frasergen.entity.Share;
import com.frasergen.entity.User;

public interface UserService {
	
	public boolean addData(User user);
	
	public boolean deleteData(int user_id);
	
	public boolean update(User user);
	
	public User queryUserById(int user_id);
	
	public User queryByAccount(String name);
	
	public List<User> querylikeUser(@Param(value="name") String name,@Param(value="email")String email);
	
	public List<User> queryAllUser();
	
	public List<User> Login(User user);
	
	public Share getShare(User user);
	
}
