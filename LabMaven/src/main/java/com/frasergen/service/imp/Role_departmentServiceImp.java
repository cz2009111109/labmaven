package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.Role_departmentDao;
import com.frasergen.entity.Role_department;
import com.frasergen.service.Role_departmentService;


@Service
public class Role_departmentServiceImp implements Role_departmentService {
	
	@Autowired
	Role_departmentDao dao;
	
	@Override
	public List<Role_department> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public Role_department queryById(int department_id) {
		// TODO Auto-generated method stub
		return dao.queryById(department_id);
	}

	@Override
	public boolean addData(Role_department role_department) {
		// TODO Auto-generated method stub
		int n=dao.addData(role_department);
		return n>0?true:false;
	}

	@Override
	public boolean updateData(Role_department role_department) {
		// TODO Auto-generated method stub
		int n=dao.updateData(role_department);
		return n>0?true:false;
	}

	@Override
	public boolean deleteData(int department_id) {
		// TODO Auto-generated method stub
		int n=dao.deleteData(department_id);
		return n>0?true:false;
	}

}
