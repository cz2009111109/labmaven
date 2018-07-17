package com.frasergen.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;
import java.net.URLDecoder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Object;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.frasergen.dao.CommodityDao;
import com.frasergen.entity.Commodity;
import com.frasergen.service.CommodityService;
import com.frasergen.util.PageUtil;
import com.frasergen.util.RestUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("commodity")
public class CommodityController {
	
	@Autowired
	CommodityService cs;
	
	@Autowired
	CommodityDao dao;
	
	/**
	 * 
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("addLargecommodity")
	public List<Commodity>  addLargeInventory(MultipartHttpServletRequest req) throws Exception{
		
		System.out.println("批量添加");
		
		
		List<Commodity> result=null;
		try {
			MultipartFile mFile=req.getFile("excel");
			result = cs.addLargeInventory(mFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	@RequestMapping("queryAllcommodity")
	@ResponseBody
	public List<Commodity> queryAllcommodity(PageUtil pg,
			HttpServletRequest req,
			HttpServletResponse res){
		try {
//			System.out.println("=====================");
//			RestUtils.getRequestParameter(req,res);
//			System.out.println("=================");
			PageUtil page=cs.queryAll(pg);
			return page.getList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	@RequestMapping("queryCommodityByPage")
	@ResponseBody
	public LinkedHashMap<String, Object> queryCommodityByPage(PageUtil pg,
			HttpServletRequest req,
			HttpServletResponse res,
			ModelAndView mv){
		LinkedHashMap<String,Object> map=new LinkedHashMap<String, Object>();
		try {
//			System.out.println("=====================");
//			RestUtils.getRequestParameter(req,res);
//			System.out.println("=================");
			PageUtil page=cs.queryByPage(pg);
			map.put("result", true);
			map.put("rows", page.getList());
			map.put("results",page.getTotalcount());
			map.put("hasError", false);
			map.put("error", "");
			mv.addObject("hasError false");
			mv.addObject(new Date());
			return map;
		} catch (Exception e) {
			// TODO: handle exception
			map.put("result", true);
			map.put("rows", "");
			map.put("results", 0);
			map.put("hasError", true);
			map.put("error", "no data");
			return map;
		}
		
	}
	
	@RequestMapping(value="updateCommodity",method=RequestMethod.POST)
	@ResponseBody
	public String updateCommodity(Commodity commodity,HttpServletRequest req,
			HttpServletResponse res){
		System.out.println("=================");
		System.out.println("updateCommodity");
		System.out.println(commodity.toString());
		return "true";
	}
	
	@RequestMapping(value="addCommodity",method=RequestMethod.POST)
	@ResponseBody
	public String addCommodity(Commodity commodity,HttpServletRequest req,
			HttpServletResponse res){
		System.out.println("=================");
		System.out.println("add");
		System.out.println(commodity.toString());
		return "true";
	}
	
	@RequestMapping("test")
	@ResponseBody
	public String test(HttpServletRequest req,
			HttpServletResponse res){
		
		System.out.println("=====================");
		RestUtils.getRequestParameter(req,res);
		System.out.println("=================");
		System.out.println(req.toString());
		System.out.println(req.getParameter("unitName"));
		System.out.println(req.getParameter("invoicestatus"));
		Map<String, String> map=RestUtils.getHeadersInfo(req);
		System.out.println("**********************");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println("key="+ entry.getKey() + ", Value = " + entry.getValue());
			
		}
		System.out.println("**********************");

		return "true";
	}
	
	@RequestMapping("Editcommodity")
	public String EditCommodity(){
		
		
		return "Editcommodity";
	}
	
	@RequestMapping("queryCommodityById")
	@ResponseBody
	public Commodity queryCommodityById(int id){
		
		return cs.queryById(id);
	}
	
	@RequestMapping(value="deletecommodity",method=RequestMethod.POST)
	@ResponseBody
	public String deleteInventory(@RequestParam("deleteId") String deleteId,HttpServletRequest request){
		String[] deleteIds=deleteId.split(",");
		List<String> successid=new ArrayList<String>();
		for(String id: deleteIds){
			if(cs.deleteData(Integer.parseInt(id))){
				successid.add(id);
			}
		}
		return successid.toString();
	}
}
