package com.frasergen.dao;

import java.util.List;

import com.frasergen.entity.Sender;

public interface SenderDao {
	
	public int addData(Sender sender);
	
	public int updateData(Sender sender);
	
	public int deleteData(int senderid);
	
	public List<Sender> queryAll();
	
	public Sender queryById(int senderid);
	
	public Sender querylike(String name);
	
}
