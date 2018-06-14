package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.Sample;

	public interface SampleService {
		
	public List<Sample> queryAll();
	
	public Sample queryById(int sampleid);
	    
	public List<Sample> queryLike(String name,String sampleType,String partname,String Species,String sampleState);
	
	public boolean addData(Sample sample);
	
	public boolean updateData(Sample sample);
	
	public boolean deleteData(int sampleid);
	
}
