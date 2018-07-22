package com.frasergen.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.InventoryDao;
import com.frasergen.entity.Inventory;
import com.frasergen.service.InventoryService;

@Service
public class InventoryServiceImp implements InventoryService {
	
	@Autowired
	InventoryDao dao;
	
	
	@Override
	public boolean addData(Inventory inventory) {
		// TODO Auto-generated method stub
		return dao.addData(inventory)>0?true:false;
	}

	@Override
	public boolean updateData(Inventory inventory) {
		// TODO Auto-generated method stub
		return dao.updateData(inventory)>0?true:false;
	}

	@Override
	public boolean deleteData(int id) {
		// TODO Auto-generated method stub
		return dao.deleteData(id)>0?true:false;
	}

	@Override
	public boolean isHave(String name) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>();
		map.put("name", name);
		List<Inventory> list=dao.queryByParam(map);
		return list.size()>0?true:false;
	}

	@Override
	public List<Inventory> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public List<Inventory> queryByParam(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

}
