package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frasergen.dao.SampleProjectDao;
import com.frasergen.entity.SampleProject;
import com.frasergen.service.SampleProjectService;


@Service
public class SampleProjectServiceImp implements SampleProjectService {

	@Autowired
	SampleProjectDao dao;
	
	@Override
	public boolean addData(SampleProject sampleProject) {
		// TODO Auto-generated method stub
		int n=dao.addData(sampleProject);
		return n>0?true:false;
	}

	@Override
	public boolean updateData(SampleProject sampleProject) {
		// TODO Auto-generated method stub
		int n=dao.updateData(sampleProject);
		return n>0?true:false;
	}

	@Override
	public boolean deleteData(int department_id) {
		// TODO Auto-generated method stub
		int n=dao.deleteData(department_id);
		return n>0?true:false;
	}

	@Override
	public List<SampleProject> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public SampleProject queryById(int department_id) {
		// TODO Auto-generated method stub
		return dao.queryById(department_id);
	}
	
	
}
