package com.frasergen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frasergen.entity.Commodity;
import com.frasergen.util.PageUtil;

public interface CommodityDao {
	
	public int addData(Commodity commodity);
	
	public int update(Commodity commodity);
	
	public int deleteData(int id);
	
	public List<Commodity> queryAll();
	
	public List<Commodity> queryByPage();
	
	public Commodity queryById(int id);
	
	public int addLargeData(@Param("list")List<Commodity> list);
	
	
}
