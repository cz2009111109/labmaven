package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.User_smtpDao;
import com.frasergen.entity.User_smtp;
import com.frasergen.service.User_smtpService;


@Service
public class User_smtpServiceImp implements User_smtpService {
	
	@Autowired
	User_smtpDao dao;
	
	@Override
	public boolean addData(User_smtp user_smtp) {
		// TODO Auto-generated method stub
		int n= dao.addData(user_smtp);
		return  n>0?true:false;
	}

	@Override
	public boolean updateData(User_smtp user_smtp) {
		// TODO Auto-generated method stub
		int n= dao.updateData(user_smtp);
		return  n>0?true:false;
	}

	@Override
	public boolean deleteData(int smtp_id) {
		// TODO Auto-generated method stub
		int n= dao.deleteData(smtp_id);
		return  n>0?true:false;
	}

	@Override
	public User_smtp queryBySmtpId(int smtp_id) {
		// TODO Auto-generated method stub
		return dao.queryBySmtpId(smtp_id);
	}

	@Override
	public User_smtp queryByUserId(int user_id) {
		// TODO Auto-generated method stub
		return dao.queryByUserId(user_id);
	}

	@Override
	public List<User_smtp> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}
	
}
