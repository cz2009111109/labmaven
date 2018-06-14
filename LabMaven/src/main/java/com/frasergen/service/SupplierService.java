package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.Supplier;

public interface SupplierService {
	
	
	public boolean addData(Supplier supplier);
	
	public boolean updateData(Supplier supplier);
	
	public boolean deleteData(int supplierid);
	
	public List<Supplier> queryAll();
	
	public Supplier queryById(int supplierid);
	
	public List<Supplier> querylikeName(String name);
}
