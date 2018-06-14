package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.Role_department;

public interface Role_departmentService {
	
	
public List<Role_department> queryAll();
	
	public Role_department queryById(int department_id);
	
	public boolean addData(Role_department role_department);
	
	public boolean updateData(Role_department role_department);
	
	public boolean deleteData(int department_id);
}
