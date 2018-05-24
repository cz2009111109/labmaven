package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.Role;

public interface RoleDao {
	
	public int addData(Role role);
	
	public int updateData(Role role);
	
	public int deleteData(int role_id);
	
	public List<Role> queryAll();
	
	public Role queryById(int role_id);
	
}
