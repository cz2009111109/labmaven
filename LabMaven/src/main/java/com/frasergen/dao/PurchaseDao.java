package com.frasergen.dao;

import java.util.Date;
import java.util.List;

import com.frasergen.entity.Purchase;

public interface PurchaseDao {

	public List<Purchase> queryAll();
	
	public Purchase queryById(int id);
	
	public List<Purchase> queryLike(int userid,int department_id,int purchaseid,String mintime,String maxtime );

	public int addData(Purchase purchase);
	
	public int update(Purchase purchase);
	
	public int deleteData(int id);
	
}
