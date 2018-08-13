package com.frasergen.dao;

import java.util.List;
import java.util.Map;

import com.frasergen.entity.Item;
import com.frasergen.util.DataSource;

@DataSource("dataSourceOne")
public interface ItemDao {
	public int addData(Item item);
	public int updateData(Item item);
	public int deleteData(int itemID);
	public List<Item> queryAll();
	public List<Item> queryByPage();
	public Item queryById(int itemID);
}