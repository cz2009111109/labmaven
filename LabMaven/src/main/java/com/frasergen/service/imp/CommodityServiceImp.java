package com.frasergen.service.imp;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.frasergen.dao.CommodityDao;
import com.frasergen.entity.Commodity;
import com.frasergen.service.CommodityService;
import com.frasergen.util.ExcelToCommodityList;
import com.frasergen.util.PageUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


@Service
public class CommodityServiceImp implements CommodityService {
	
	@Autowired
	CommodityDao dao;
	
	@Override
	public boolean addData(Commodity commodity) {
		// TODO Auto-generated method stub
		return dao.addData(commodity)>0?true:false;
	}

	@Override
	public boolean update(Commodity commodity) {
		// TODO Auto-generated method stub
		return dao.update(commodity)>0?true:false;
	}

	@Override
	public boolean deleteData(int id) {
		// TODO Auto-generated method stub
		return dao.deleteData(id)>0?true:false;
	}

	@Override
	public PageUtil queryAll(PageUtil pg) {
		Page page = PageHelper.startPage(
				pg.getPageindex(),
				pg.getPagesize(), 
				true);
		pg.setList(dao.queryByPage());
		pg.setTotalcount(page.getTotal());
		pg.setTotalnum(page.getPageNum());
		return pg;
	}
	
	@Override
	public PageUtil queryByPage(PageUtil pg) {
		Page page = PageHelper.startPage(
				pg.getPageindex(),
				pg.getPagesize(), 
				true);
		pg.setList(dao.queryByPage());
		pg.setTotalcount(page.getTotal());
		pg.setTotalnum(page.getPageNum());
		return pg;
	}

	@Override
	public Commodity queryById(int id) {
		// TODO Auto-generated method stub
		return dao.queryById(id);
	}

	@Override
	public List<Commodity> addLargeInventory(MultipartFile mFile) throws Exception {
		int result=0;
		System.out.println(mFile);
		if(!mFile.isEmpty()){
			List<Commodity> list=ExcelToCommodityList.getExcel(mFile, 0);
//			System.out.println("asd"+list.size());
//			for (Commodity commodity : list) {
//				System.out.println(commodity.toString());
//			}
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
