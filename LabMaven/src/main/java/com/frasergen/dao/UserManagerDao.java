package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.UserManager;

public interface UserManagerDao {
	
	public int addData(UserManager userManager);
	
	public int updateData(UserManager userManager);
	
	public int deleteData(int id);
	
	public List<UserManager> queryAll();
	
	public UserManager queryById(int id,int user_id,int role_id);
	
	
}
