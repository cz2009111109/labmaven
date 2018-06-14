package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.frasergen.dao.PurchaseOrderDao;
import com.frasergen.entity.PurchaseOrder;
import com.frasergen.service.PurchaseOrderService;
import com.frasergen.util.ExcelToPurchaseOrderList;


@Service
public class PurchaseOrderServiceImp implements PurchaseOrderService {
	
	@Autowired
	PurchaseOrderDao dao;
	
	@Override
	public boolean addData(PurchaseOrder purchaseOrder) {
		// TODO Auto-generated method stub
		return dao.addData(purchaseOrder)>0?true:false;
	}

	@Override
	public boolean update(PurchaseOrder purchaseOrder) {
		// TODO Auto-generated method stub
		return dao.update(purchaseOrder)>0?true:false;
	}

	@Override
	public boolean deleteData(int id) {
		// TODO Auto-generated method stub
		return dao.deleteData(id)>0?true:false;
	}

	@Override
	public List<PurchaseOrder> queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public PurchaseOrder queryById(int id) {
		// TODO Auto-generated method stub
		return dao.queryById(id);
	}

	@Override
	public List<PurchaseOrder> addLargePurchaseOrder(MultipartFile mFile) throws Exception {
		int result=0;
		if(!mFile.isEmpty()){
			List<PurchaseOrder> list=ExcelToPurchaseOrderList.getExcel(mFile, 0);
			System.out.println("asd"+list.size());
			for (PurchaseOrder purchaseOrder : list) {
				System.out.println(purchaseOrder.toString());
			}
			result=dao.addLargeData(list);
			if(result>0){
				return list;
			}else{
				return null;
			}
		}else{
			return null;
		}
		
	}
	
}
