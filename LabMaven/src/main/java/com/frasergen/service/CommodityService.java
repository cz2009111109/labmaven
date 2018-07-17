package com.frasergen.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.frasergen.entity.Commodity;
import com.frasergen.util.PageUtil;

public interface CommodityService {
	
	public boolean addData(Commodity commodity);
	
	public boolean update(Commodity commodity);
	
	public boolean deleteData(int id);
	
	public PageUtil queryAll(PageUtil pg);
	
	public PageUtil queryByPage(PageUtil pg);
	
	public Commodity queryById(int id);
	
	public List<Commodity> addLargeInventory(MultipartFile mFile)throws Exception;
}
