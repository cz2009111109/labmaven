package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.User_category;


public interface User_categoryDao {
	
	
	
	public int addData(User_category user_category);
	
	public int updateData(User_category user_category);
	
	
	public int deleteData(int category_id);
	
	public User_category queryById(int category_id);
	
	public List<User_category> queryAll();
	

	
	
}
