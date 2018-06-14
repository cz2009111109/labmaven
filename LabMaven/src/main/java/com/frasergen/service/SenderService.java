package com.frasergen.service;

import java.util.List;

import com.frasergen.entity.Sender;

public interface SenderService {
	
	
	public boolean addData(Sender sender);
	
	public boolean updateData(Sender sender);
	
	public boolean deleteData(int senderid);
	
	public List<Sender> queryAll();
	
	public Sender queryById(int senderid);
	
	public Sender querylike(String name);
}
