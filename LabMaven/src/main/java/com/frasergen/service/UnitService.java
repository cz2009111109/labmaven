package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.Unit;

public interface UnitService {
	
	
	public boolean addData(Unit unit);
	
	public boolean deleteData(int unitid);
	
	public boolean updateData(Unit unit);
	
	public List<Unit> queryAll();
	
	public Unit queryById(int unitid);
}
