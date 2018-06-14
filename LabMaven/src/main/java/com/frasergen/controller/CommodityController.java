package com.frasergen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.frasergen.entity.Commodity;
import com.frasergen.service.CommodityService;

@Controller
@RequestMapping("commodity")
public class CommodityController {
	
	@Autowired
	CommodityService is;
	
	@ResponseBody
	@RequestMapping("addLargecommodity")
	public List<Commodity>  addLargeInventory(MultipartHttpServletRequest req){
		
		System.out.println("批量添加");
		List<Commodity> result=null;
		try {
			MultipartFile mFile=req.getFile("excel");
			result = is.addLargeInventory(mFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	@RequestMapping("queryAllcommodity")
	@ResponseBody
	public List<Commodity> queryAllInventory(){
		
		return is.queryAll();
	}
	
	@RequestMapping("deletecommodity")
	public boolean deleteInventory(){
		
		return false;
	}
}
