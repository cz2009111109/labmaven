package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.SampleProject;

public interface SampleProjectService {
	
	
	public boolean addData(SampleProject sampleProject);
	
	public boolean updateData(SampleProject sampleProject);
	
	public boolean deleteData(int department_id);
	
	public List<SampleProject> queryAll();
	
	public SampleProject queryById(int department_id);
}
