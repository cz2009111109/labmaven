package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.Unit;

public interface UnitDao {
	
	public int addData(Unit unit);
	
	public int deleteData(int unitid);
	
	public int updateData(Unit unit);
	
	public List<Unit> queryAll();
	
	public Unit queryById(int unitid);
	
}
