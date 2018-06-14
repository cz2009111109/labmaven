package com.frasergen.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.frasergen.entity.PurchaseOrder;

public class ExcelToPurchaseOrderList {
	private static final String XLS="xls";
	private static final String XLSX = "xlsx";
	private static final String SEPARATOR = "|";
	
	
	public static List<PurchaseOrder> getExcel(MultipartFile mFile,int sheetNum) throws FileNotFoundException, IOException{
		InputStream is=mFile.getInputStream();//获取文件流
		String fileName=mFile.getOriginalFilename();//获取文件名
		String prefix=fileName.substring(fileName.lastIndexOf(".")+1);
		return exportListFromExcel(is,prefix,sheetNum);
	}
	
	/**
	 * 由指定的sheet导出值List
	 * @param is
	 * @param name
	 * @param sheetNum
	 * @return
	 * @throws IOException
	 */
	public static List<PurchaseOrder> exportListFromExcel(InputStream is,String name,int sheetNum) throws IOException{
		Workbook workbook = null;
		//得到excel操作流的对象workbooka
		if(name.equals(XLS)){
			workbook = new HSSFWorkbook(is);			
		}else if(name.equals(XLSX)){
			workbook = new XSSFWorkbook(is);
		}		
		return getSheet(workbook,sheetNum);

	}
	
	/**
	 * 得到sheet表中具体的信息，保存到Client对象集合中
	 * @param workbook
	 * @param sheetNum
	 * @return
	 */
	public static List<PurchaseOrder> getSheet(Workbook workbook,int sheetNum){
		Sheet sheet = workbook.getSheetAt(sheetNum);//第sheetNum张表，下标从0开始
		int sumrow = sheet.getLastRowNum();//总数据量
		int firstrow = sheet.getFirstRowNum();//起始行，从0开始，字段属性行
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//时间类型格式化
		DecimalFormat df = new DecimalFormat("0");//小数类型格式化，把科学计数法的double类型完全显示
		List<PurchaseOrder> list = new ArrayList<PurchaseOrder>();
		PurchaseOrder purchaseOrder = null;
		boolean flag=false;//标识必填项是否为空
		//sumrow行数据，从第2条数据开始			
		for(int i = 2;i <= sumrow;i++){//行
			Row row = sheet.getRow(i);
			if(row == null){				
				continue;
			}
			short sh = sheet.getRow(i).getLastCellNum();//得到单元格的数目
			purchaseOrder = new PurchaseOrder();//得到Client对象
			if(row.getCell(0)==null||row.getCell(1)==null||row.getCell(2)==null||row.getCell(3)==null
			  ||row.getCell(5)==null||row.getCell(9)==null||row.getCell(10)==null||row.getCell(13)==null
			  /*||row.getCell(9).toString().equals("")||row.getCell(13).toString().equals("")*/
			   ){
				flag=true;
			}else{
				for(int j = 0;j<=sh;j++){//sh个属性值  列
					Cell c = row.getCell(j);
					String s = null;
					if(c != null){	
						switch(j){
						case 0://申请单号
							s = c.toString();
							System.out.println("申请单号："+s.toString());
							purchaseOrder.setPurchaseid(s);
							break;
						case 1://申请部门名称
							c.setCellType(CellType.STRING);
							s = c.getStringCellValue();
							purchaseOrder.setDepartmentname(s);
							break;
						case 2://申请人(必填项)
							c.setCellType(CellType.STRING);
							s = c.toString();
							purchaseOrder.setUsername(s);
							break;
						case 3://申购日期
							Date date = c.getDateCellValue();
							System.out.println("申购日期date:"+date);
							s = sdf.format(date);
							System.out.println("申购日期:"+s);
							//s=c.toString();
							purchaseOrder.setApplytime(s);
							break;
						case 4://物品名称
							c.setCellType(CellType.STRING);
							s = c.getStringCellValue();
							purchaseOrder.setGoodsname(s);;
							break;
						case 5://品牌
							//s = df.format(c.getNumericCellValue());
							c.setCellType(CellType.STRING);
							s=c.toString();
							System.out.println("品牌："+s);
							purchaseOrder.setBrands(s);
							break;
						case 6://货号
							s = c.toString();
							purchaseOrder.setItemnumber(s);;
							break;
						case 7://目录价格
							c.setCellType(CellType.NUMERIC);
							purchaseOrder.setCatalogprice(c.getNumericCellValue());;
							break;
						case 8://采购价格
							c.setCellType(CellType.NUMERIC);
							purchaseOrder.setActualprice(c.getNumericCellValue());;
							break;
						case 9://采购数量
							c.setCellType(CellType.NUMERIC);
							purchaseOrder.setNumber(c.getNumericCellValue());;
							break;
						case 10://总价
							c.setCellType(CellType.NUMERIC);
							purchaseOrder.setPrice(c.getNumericCellValue());;
							break;
						case 11://规格单位
							c.setCellType(CellType.STRING);
							s=c.toString();
							purchaseOrder.setUnitName(s);
							break;
						case 12://规格数量
							c.setCellType(CellType.NUMERIC);
							purchaseOrder.setNorm(c.getNumericCellValue());;
							break;
						case 13://用途
							c.setCellType(CellType.STRING);
							s = c.getStringCellValue();
							purchaseOrder.setFunction(s);;
							break;
						case 14://备注
							c.setCellType(CellType.STRING);
							s = c.getStringCellValue();
							purchaseOrder.setRemark(s);;
							break;
						default:
							break;
						}					
					}					
				}
				list.add(purchaseOrder);		
			}
		}
		System.out.println("panda"+flag);
		return flag==true?null:list;
	}
}
