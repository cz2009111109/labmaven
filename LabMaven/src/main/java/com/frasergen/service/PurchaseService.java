package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.Purchase;

public interface PurchaseService {
	
	
	
public List<Purchase> queryAll();
	
	public Purchase queryById(int id);
	
	public List<Purchase> queryLike(int userid,int department_id,int purchaseid,String mintime,String maxtime );

	public boolean addData(Purchase purchase);
	
	public boolean update(Purchase purchase);
	
	public boolean deleteData(int id);
}
