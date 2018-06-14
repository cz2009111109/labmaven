package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.SampleProject;

public interface SampleProjectDao {
	
	public int addData(SampleProject sampleProject);
	
	public int updateData(SampleProject sampleProject);
	
	public int deleteData(int department_id);
	
	public List<SampleProject> queryAll();
	
	public SampleProject queryById(int department_id);
}
