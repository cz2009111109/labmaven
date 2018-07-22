package com.frasergen.service;

import java.util.List;
import java.util.Map;

import com.frasergen.entity.Inventory;

public interface InventoryService {
	
	
	public boolean addData(Inventory inventory);
	
	public boolean updateData(Inventory inventory);
	
	public boolean deleteData(int id);
	
	public boolean isHave(String name);
	
	public List<Inventory> queryAll();
	
	public List<Inventory> queryByParam(Map map);
}
