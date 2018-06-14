package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.PurchaseDao;
import com.frasergen.entity.Purchase;
import com.frasergen.service.PurchaseService;


@Service
public class PurchaseServiceImp implements PurchaseService {
	
	@Autowired
	PurchaseDao dao;
	
	
	@Override
	public List<Purchase> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public Purchase queryById(int id) {
		// TODO Auto-generated method stub
		return dao.queryById(id);
	}

	@Override
	public List<Purchase> queryLike(int userid, int department_id, int purchaseid, String mintime, String maxtime) {
		// TODO Auto-generated method stub
		return dao.queryLike(userid, department_id, purchaseid, mintime, maxtime);
	}

	@Override
	public boolean addData(Purchase purchase) {
		// TODO Auto-generated method stub
		int n=dao.addData(purchase);
		return n>0?true:false;
	}

	@Override
	public boolean update(Purchase purchase) {
		// TODO Auto-generated method stub
		int n=dao.update(purchase);
		return n>0?true:false;
	}

	@Override
	public boolean deleteData(int id) {
		// TODO Auto-generated method stub
		int n=dao.deleteData(id);
		return n>0?true:false;
	}
	
}
