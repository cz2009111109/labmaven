package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.User_smtp;

public interface User_smtpService {
	public boolean addData(User_smtp user_smtp);
	
	public boolean updateData(User_smtp user_smtp);
	
	
	public boolean deleteData(int smtp_id);
	
	public User_smtp queryBySmtpId(int smtp_id);
	
	public User_smtp queryByUserId(int user_id);
	
	public List<User_smtp> queryAll();
}
