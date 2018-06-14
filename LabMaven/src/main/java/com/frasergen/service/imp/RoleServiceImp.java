package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.RoleDao;
import com.frasergen.entity.Role;
import com.frasergen.service.RoleService;


@Service
public class RoleServiceImp implements RoleService {
	
	@Autowired
	RoleDao dao;
	
	@Override
	public boolean addData(Role role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateData(Role role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteData(int role_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Role> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role queryById(int role_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
