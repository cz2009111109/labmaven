package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.Supplier;

public interface SupplierDao {
	
	public List<Supplier> queryAll();
	
	public Supplier queryById(int supplierid);
	
	public List<Supplier> querylikeName(String name);
	
	public int addData(Supplier supplier);
	
	public int updateData(Supplier supplier);
	
	public int deleteData(int supplierid);
	
}
