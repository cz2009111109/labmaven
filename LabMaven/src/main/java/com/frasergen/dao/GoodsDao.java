package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.Goods;

public interface GoodsDao {
	
	public int addData(Goods goods);
	
	public int updateData(Goods goods);
	
	public int deleteData(int goodsid);
	
	public List<Goods> queryAll();
	
	public Goods queryById(int goodsid);
	
	public List<Goods> queryLike(String name,String Brands,String function);
	
}
