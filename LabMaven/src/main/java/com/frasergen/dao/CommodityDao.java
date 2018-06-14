package com.frasergen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frasergen.entity.Commodity;

public interface CommodityDao {
	
	public int addData(Commodity commodity);
	
	public int update(Commodity commodity);
	
	public int deleteData(int id);
	
	public List<Commodity> queryAll();
	
	public int addLargerData(@Param("list")List<Commodity> list);
}
