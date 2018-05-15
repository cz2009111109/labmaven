package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.User_category;


public interface User_categoryDao {
	
public List<User_category> queryAll();
	
	public int addData(User_category user_smtp);
	
	public int updateData(User_category user_smtp);
	
	
	public int deleteData(int categoryid);
	
	public User_category queryById(int categoryid);
	

	
	
}
