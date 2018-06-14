package com.frasergen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.frasergen.dao.PurchaseOrderDao;
import com.frasergen.entity.PurchaseOrder;
import com.frasergen.service.PurchaseOrderService;

@Controller
@RequestMapping("purchase")
public class PurchaseController {
	
	@Autowired
	PurchaseOrderService pos;
	
	
	@ResponseBody
	@RequestMapping("addLargePurchaseOrder")
	public List<PurchaseOrder> addLargePurchaseOrder(MultipartHttpServletRequest req){
		System.out.println("批量添加");
		List<PurchaseOrder> result=null;
		try {
			MultipartFile mFile=req.getFile("excel");
			result = pos.addLargePurchaseOrder(mFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	@RequestMapping("queryAllPurchaseOrder")
	@ResponseBody
	public List<PurchaseOrder> queryAllPurchaseOrder(){
		
		return pos.queryAll();
	}
}
