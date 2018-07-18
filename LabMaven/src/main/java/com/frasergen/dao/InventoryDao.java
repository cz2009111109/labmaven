package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.Inventory;

public interface InventoryDao {
	
	public int addData(Inventory inventory);
	public int updateData(Inventory inventory);
	public int deleteData(Inventory inventory);
	public List<Inventory> queryAll();
	public Inventory queryById(int id);
	public List<Inventory> queryByParam();
	
}
