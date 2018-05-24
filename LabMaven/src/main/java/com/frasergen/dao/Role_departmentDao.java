package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.Role_department;

public interface Role_departmentDao {
	
	public List<Role_department> queryAll();
	
	public Role_department queryById(int department_id);
	
	public int addData(Role_department role_department);
	
	public int updateData(Role_department role_department);
	
	public int deleteData(int department_id);
}
