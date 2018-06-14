package com.frasergen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.frasergen.entity.Share;
import com.frasergen.entity.User;



public interface UserDao {
	
	public int addUser(User user);
	
	public User queryUserById(int user_id);
	
	public User queryByAccount(String name);
	
	public List<User> querylikeUser(@Param(value="name") String name,@Param(value="email")String email);
	
	public List<User> queryAll();
	
	public int updateUser(User user);
	
	public int delUser(int user_id);
	
	public Share getShare(User user);
	

}
