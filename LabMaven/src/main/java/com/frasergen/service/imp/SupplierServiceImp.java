package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.SupplierDao;
import com.frasergen.entity.Supplier;
import com.frasergen.service.SupplierService;


@Service
public class SupplierServiceImp implements SupplierService {
	
	@Autowired
	SupplierDao dao;
	
	@Override
	public boolean addData(Supplier supplier) {
		// TODO Auto-generated method stub
		int n=dao.addData(supplier);
		return n>0?true:false;
	}

	@Override
	public boolean updateData(Supplier supplier) {
		// TODO Auto-generated method stub
		int n=dao.updateData(supplier);
		return n>0?true:false;
	}

	@Override
	public boolean deleteData(int supplierid) {
		// TODO Auto-generated method stub
		int n=dao.deleteData(supplierid);
		return n>0?true:false;
	}

	@Override
	public List<Supplier> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public Supplier queryById(int supplierid) {
		// TODO Auto-generated method stub
		return dao.queryById(supplierid);
	}

	@Override
	public List<Supplier> querylikeName(String name) {
		// TODO Auto-generated method stub
		return dao.querylikeName(name);
	}

}
