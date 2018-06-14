package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.SampleDao;
import com.frasergen.entity.Sample;
import com.frasergen.service.SampleService;


@Service
public class SampleServiceImp implements SampleService {
	
	
	@Autowired
	SampleDao dao;
	
	@Override
	public List<Sample> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public Sample queryById(int sampleid) {
		// TODO Auto-generated method stub
		return dao.queryById(sampleid);
	}

	@Override
	public List<Sample> queryLike(String name, String sampleType, String partname, String Species, String sampleState) {
		// TODO Auto-generated method stub
		return dao.queryLike(name, sampleType, partname, Species, sampleState);
	}

	@Override
	public boolean addData(Sample sample) {
		// TODO Auto-generated method stub
		int n=dao.addData(sample);
		return  n>0?true:false;
	}

	@Override
	public boolean updateData(Sample sample) {
		// TODO Auto-generated method stub
		int n=dao.updateData(sample);
		return  n>0?true:false;
	}

	@Override
	public boolean deleteData(int sampleid) {
		// TODO Auto-generated method stub
		int n=dao.deleteData(sampleid);
		return  n>0?true:false;
	}
	
	
	
}
