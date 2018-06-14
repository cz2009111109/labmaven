package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.Role;

public interface RoleService {
	
	public boolean addData(Role role);
	
	public boolean updateData(Role role);
	
	public boolean deleteData(int role_id);
	
	public List<Role> queryAll();
	
	public Role queryById(int role_id);
}
