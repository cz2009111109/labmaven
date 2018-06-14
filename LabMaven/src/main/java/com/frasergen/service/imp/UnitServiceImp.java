package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.UnitDao;
import com.frasergen.entity.Unit;
import com.frasergen.service.UnitService;


@Service
public class UnitServiceImp implements UnitService {
	
	@Autowired
	UnitDao dao;

	@Override
	public boolean addData(Unit unit) {
		// TODO Auto-generated method stub
		int n=dao.addData(unit);
		return n>0?true:false;
	}

	@Override
	public boolean deleteData(int unitid) {
		// TODO Auto-generated method stub
		int n=dao.deleteData(unitid);
		return n>0?true:false;
	}

	@Override
	public boolean updateData(Unit unit) {
		// TODO Auto-generated method stub
		int n=dao.updateData(unit);
		return n>0?true:false;
	}

	@Override
	public List<Unit> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public Unit queryById(int unitid) {
		// TODO Auto-generated method stub
		return dao.queryById(unitid);
	}
	
	
	
}
