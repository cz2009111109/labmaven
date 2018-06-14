package com.frasergen.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.frasergen.entity.PurchaseOrder;

public interface PurchaseOrderService {
	
	public boolean addData(PurchaseOrder purchaseOrder);
	
	public boolean update(PurchaseOrder purchaseOrder);
	
	public boolean deleteData(int id);
	
	public List<PurchaseOrder> queryAll();
	
	public PurchaseOrder queryById(int id);
	
	public List<PurchaseOrder> addLargePurchaseOrder(MultipartFile mFile)throws Exception;
}
