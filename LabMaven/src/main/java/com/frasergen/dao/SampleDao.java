package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.Sample;

public interface SampleDao {

	public List<Sample> queryAll();
	
	public Sample queryById(int sampleid);
	    
	public List<Sample> queryLike(String name,String sampleType,String partname,String Species,String sampleState);
	
	public int addData(Sample sample);
	
	public int updateData(Sample sample);
	
	public int deleteData(int sampleid);
	
	
}
