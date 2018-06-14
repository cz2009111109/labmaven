package com.frasergen.service.imp;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.frasergen.dao.UserDao;
import com.frasergen.entity.Share;
import com.frasergen.entity.User;
import com.frasergen.service.UserService;


@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	UserDao userDao;
	
	
	
	@Override
	public Share getShare(User user) {
		// TODO Auto-generated method stub
		return userDao.getShare(user);
	}

	@Override
	public List<User> Login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addData(User user) {
		// TODO Auto-generated method stub
		
		int n=userDao.addUser(user);
		return n>0?true:false;
	}

	@Override
	public boolean deleteData(int user_id) {
		int n=userDao.delUser(user_id);
		return n>0?true:false;
	}

	@Override
	public boolean update(User user) {
		int n=userDao.updateUser(user);
		return n>0?true:false;
	}

	@Override
	public User queryUserById(int user_id) {
		// TODO Auto-generated method stub
		return userDao.queryUserById(user_id);
	}

	@Override
	public User queryByAccount(String name) {
		// TODO Auto-generated method stub
		return userDao.queryByAccount(name);
	}

	@Override
	public List<User> querylikeUser(String name, String email) {
		// TODO Auto-generated method stub
		return userDao.querylikeUser(name, email);
	}

	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		return queryAllUser();
	}
	
}
