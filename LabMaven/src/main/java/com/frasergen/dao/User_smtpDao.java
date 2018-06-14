package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.User_smtp;

public interface User_smtpDao {
	
	
	
	public int addData(User_smtp user_smtp);
	
	public int updateData(User_smtp user_smtp);
	
	
	public int deleteData(int smtp_id);
	
	public User_smtp queryBySmtpId(int smtp_id);
	
	public User_smtp queryByUserId(int user_id);
	
	public List<User_smtp> queryAll();
}
