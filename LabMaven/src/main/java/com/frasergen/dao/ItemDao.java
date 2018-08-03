package com.frasergen.dao;

import java.util.List;
import java.util.Map;

import com.frasergen.entity.Item;

public interface ItemDao {
	public int addData(Item item);
	public int updateData(Item item);
	public int deleteData(int itemID);
	public List<Item> queryAll();
	public List<Item> queryByPage();
	public List<Item> queryByParam(Map map);
	public Item queryById(int itemID);
}