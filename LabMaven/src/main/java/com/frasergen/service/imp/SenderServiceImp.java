package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.SenderDao;
import com.frasergen.entity.Sender;
import com.frasergen.service.SenderService;


@Service
public class SenderServiceImp implements SenderService {
	
	@Autowired
	SenderDao dao;
	
	@Override
	public boolean addData(Sender sender) {
		// TODO Auto-generated method stub
		int n=dao.addData(sender);
		return  n>0?true:false;
	}

	@Override
	public boolean updateData(Sender sender) {
		// TODO Auto-generated method stub
		int n=dao.updateData(sender);
		return  n>0?true:false;
	}

	@Override
	public boolean deleteData(int senderid) {
		// TODO Auto-generated method stub
		int n=dao.deleteData(senderid);
		return  n>0?true:false;
	}

	@Override
	public List<Sender> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public Sender queryById(int senderid) {
		// TODO Auto-generated method stub
		return dao.queryById(senderid);
	}

	@Override
	public Sender querylike(String name) {
		// TODO Auto-generated method stub
		return dao.querylike(name);
	}

}
