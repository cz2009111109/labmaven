package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.User_category;

public interface User_categoryService {
	
	
	public boolean addData(User_category user_smtp);
	
	public boolean updateData(User_category user_smtp);
	
	
	public boolean deleteData(int categoryid);
	
	public List<User_category> queryAll();
	
	public User_category queryById(int categoryid);
}
