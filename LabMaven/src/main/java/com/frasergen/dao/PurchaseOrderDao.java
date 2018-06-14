package com.frasergen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frasergen.entity.PurchaseOrder;

public interface PurchaseOrderDao {
	
	
	public int addData(PurchaseOrder purchaseOrder);
	
	public int update(PurchaseOrder purchaseOrder);
	
	public int deleteData(int id);
	
	public List<PurchaseOrder> queryAll();
	
	public PurchaseOrder queryById(int id);
	
	public int addLargeData(@Param("list")List<PurchaseOrder> list );
	
}
