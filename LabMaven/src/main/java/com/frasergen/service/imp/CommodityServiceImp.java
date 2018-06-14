package com.frasergen.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.frasergen.dao.CommodityDao;
import com.frasergen.entity.Commodity;
import com.frasergen.service.CommodityService;
import com.frasergen.util.ExcelToCommodityList;


@Service
public class CommodityServiceImp implements CommodityService {
	
	@Autowired
	CommodityDao dao;
	
	@Override
	public boolean addData(Commodity commodity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Commodity commodity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteData(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Commodity> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Commodity queryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commodity> addLargeInventory(MultipartFile mFile) throws Exception {
		int result=0;
		if(!mFile.isEmpty()){
			List<Commodity> list=ExcelToCommodityList.getExcel(mFile, 0);
			System.out.println("asd"+list.size());
			for (Commodity commodity : list) {
				System.out.println(commodity.toString());
			}
			result=dao.addLargerData(list);
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
