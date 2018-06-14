package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.GoodsDao;
import com.frasergen.entity.Goods;
import com.frasergen.service.GoodsService;


@Service
public class GoodsServiceImp implements GoodsService {

	@Autowired
	GoodsDao dao;
	
	@Override
	public boolean addData(Goods goods) {
		// TODO Auto-generated method stub
		int n=dao.addData(goods);
		return n>0?true:false;
	}

	@Override
	public boolean updateData(Goods goods) {
		// TODO Auto-generated method stub
		int n=dao.updateData(goods);
		return n>0?true:false;
	}

	@Override
	public boolean deleteData(int goodsid) {
		// TODO Auto-generated method stub
		int n=dao.deleteData(goodsid);
		return n>0?true:false;
	}

	@Override
	public List<Goods> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public Goods queryById(int goodsid) {
		// TODO Auto-generated method stub
		return dao.queryById(goodsid);
	}

	@Override
	public List<Goods> queryLike(String name, String Brands, String function) {
		// TODO Auto-generated method stub
		return dao.queryLike(name, Brands, function);
	}
	
}
