package com.frasergen.dao;

import java.util.List;
import java.util.Map;

import com.frasergen.entity.Inventory;

public interface InventoryDao {
	
	public int addData(Inventory inventory);
	public int updateData(Inventory inventory);
	public int deleteData(int id);
	public List<Inventory> queryAll();
	public List<Inventory> queryByPage();
	public List<Inventory> queryByParam(Map map);
	public Inventory queryById(int id);
	
	
}
