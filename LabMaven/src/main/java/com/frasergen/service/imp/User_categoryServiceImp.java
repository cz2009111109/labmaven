package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.User_categoryDao;
import com.frasergen.entity.User_category;
import com.frasergen.service.User_categoryService;


@Service
public class User_categoryServiceImp implements User_categoryService {
	
	
	@Autowired
	User_categoryDao dao;
	
	@Override
	public boolean addData(User_category user_category) {
		// TODO Auto-generated method stub
		int n=dao.addData(user_category);
		return n>0?true:false;
	}

	@Override
	public boolean updateData(User_category user_category) {
		// TODO Auto-generated method stub
		int n=dao.updateData(user_category);
		return n>0?true:false;
	}

	@Override
	public boolean deleteData(int category_id) {
		// TODO Auto-generated method stub
		int n=dao.deleteData(category_id);
		return n>0?true:false;
	}

	@Override
	public List<User_category> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public User_category queryById(int category_id) {
		// TODO Auto-generated method stub
		return dao.queryById(category_id);
	}

}
