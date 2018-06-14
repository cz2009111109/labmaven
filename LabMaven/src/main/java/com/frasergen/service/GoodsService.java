package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.Goods;

public interface GoodsService {
	
	
	public boolean addData(Goods goods);
	
	public boolean updateData(Goods goods);
	
	public boolean deleteData(int goodsid);
	
	public List<Goods> queryAll();
	
	public Goods queryById(int goodsid);
	
	public List<Goods> queryLike(String name,String Brands,String function);
	
}
