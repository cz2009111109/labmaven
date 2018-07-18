package com.frasergen.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Commodity {
	private int id; //主键
	private String purchaseid;//申请单号
	private String departmentname;//申请部门名称
	private String username;//申请人
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date applytime;//申购日期
	private String goodsname;//物品名称
	private String brands;//品牌
	private String itemnumber;//货号
	private double catalogprice;//目录价格
	private double actualprice;//采购价格
	private double number;//采购数量
	private double price;//总价
	private String unitName;//规格单位
	private double norm;//规格数量
	private double normnumber;//标准数量
	private String company;//采购公司
	private String function;//用途
	private String invoicestatus;//开票状态
	private String paymentstatus;//付款状态
	private String status;//到货状态
	private String remark;//备注
	private int invertoryid;
	/***新加字段**/
	private String descritpion;//说明
	private String category;//类别
	private double inventoryNum;//库存量
	private Inventory inventory;//库位
	public Commodity() {
		super();
	}
	public Commodity(int id, String purchaseid, String departmentname, String username, Date applytime,
			String goodsname, String brands, String itemnumber, double catalogprice, double actualprice, double number,
			double price, String unitName, double norm, double normnumber, String company, String function,
			String invoicestatus, String paymentstatus, String status, String remark, int invertoryid,
			String descritpion, String category, double inventoryNum, Inventory inventory) {
		super();
		this.id = id;
		this.purchaseid = purchaseid;
		this.departmentname = departmentname;
		this.username = username;
		this.applytime = applytime;
		this.goodsname = goodsname;
		this.brands = brands;
		this.itemnumber = itemnumber;
		this.catalogprice = catalogprice;
		this.actualprice = actualprice;
		this.number = number;
		this.price = price;
		this.unitName = unitName;
		this.norm = norm;
		this.normnumber = normnumber;
		this.company = company;
		this.function = function;
		this.invoicestatus = invoicestatus;
		this.paymentstatus = paymentstatus;
		this.status = status;
		this.remark = remark;
		this.invertoryid = invertoryid;
		this.descritpion = descritpion;
		this.category = category;
		this.inventoryNum = inventoryNum;
		this.inventory = inventory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(String purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getApplytime() {
		return applytime;
	}
	public void setApplytime(Date applytime) {
		this.applytime = applytime;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getBrands() {
		return brands;
	}
	public void setBrands(String brands) {
		this.brands = brands;
	}
	public String getItemnumber() {
		return itemnumber;
	}
	public void setItemnumber(String itemnumber) {
		this.itemnumber = itemnumber;
	}
	public double getCatalogprice() {
		return catalogprice;
	}
	public void setCatalogprice(double catalogprice) {
		this.catalogprice = catalogprice;
	}
	public double getActualprice() {
		return actualprice;
	}
	public void setActualprice(double actualprice) {
		this.actualprice = actualprice;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public double getNorm() {
		return norm;
	}
	public void setNorm(double norm) {
		this.norm = norm;
	}
	public double getNormnumber() {
		return normnumber;
	}
	public void setNormnumber(double normnumber) {
		this.normnumber = normnumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getInvoicestatus() {
		return invoicestatus;
	}
	public void setInvoicestatus(String invoicestatus) {
		this.invoicestatus = invoicestatus;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getInvertoryid() {
		return invertoryid;
	}
	public void setInvertoryid(int invertoryid) {
		this.invertoryid = invertoryid;
	}
	public String getDescritpion() {
		return descritpion;
	}
	public void setDescritpion(String descritpion) {
		this.descritpion = descritpion;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getInventoryNum() {
		return inventoryNum;
	}
	public void setInventoryNum(double inventoryNum) {
		this.inventoryNum = inventoryNum;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(actualprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((applytime == null) ? 0 : applytime.hashCode());
		result = prime * result + ((brands == null) ? 0 : brands.hashCode());
		temp = Double.doubleToLongBits(catalogprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((departmentname == null) ? 0 : departmentname.hashCode());
		result = prime * result + ((descritpion == null) ? 0 : descritpion.hashCode());
		result = prime * result + ((function == null) ? 0 : function.hashCode());
		result = prime * result + ((goodsname == null) ? 0 : goodsname.hashCode());
		result = prime * result + id;
		result = prime * result + ((inventory == null) ? 0 : inventory.hashCode());
		temp = Double.doubleToLongBits(inventoryNum);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + invertoryid;
		result = prime * result + ((invoicestatus == null) ? 0 : invoicestatus.hashCode());
		result = prime * result + ((itemnumber == null) ? 0 : itemnumber.hashCode());
		temp = Double.doubleToLongBits(norm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(normnumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(number);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((paymentstatus == null) ? 0 : paymentstatus.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((purchaseid == null) ? 0 : purchaseid.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((unitName == null) ? 0 : unitName.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (Double.doubleToLongBits(actualprice) != Double.doubleToLongBits(other.actualprice))
			return false;
		if (applytime == null) {
			if (other.applytime != null)
				return false;
		} else if (!applytime.equals(other.applytime))
			return false;
		if (brands == null) {
			if (other.brands != null)
				return false;
		} else if (!brands.equals(other.brands))
			return false;
		if (Double.doubleToLongBits(catalogprice) != Double.doubleToLongBits(other.catalogprice))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (departmentname == null) {
			if (other.departmentname != null)
				return false;
		} else if (!departmentname.equals(other.departmentname))
			return false;
		if (descritpion == null) {
			if (other.descritpion != null)
				return false;
		} else if (!descritpion.equals(other.descritpion))
			return false;
		if (function == null) {
			if (other.function != null)
				return false;
		} else if (!function.equals(other.function))
			return false;
		if (goodsname == null) {
			if (other.goodsname != null)
				return false;
		} else if (!goodsname.equals(other.goodsname))
			return false;
		if (id != other.id)
			return false;
		if (inventory == null) {
			if (other.inventory != null)
				return false;
		} else if (!inventory.equals(other.inventory))
			return false;
		if (Double.doubleToLongBits(inventoryNum) != Double.doubleToLongBits(other.inventoryNum))
			return false;
		if (invertoryid != other.invertoryid)
			return false;
		if (invoicestatus == null) {
			if (other.invoicestatus != null)
				return false;
		} else if (!invoicestatus.equals(other.invoicestatus))
			return false;
		if (itemnumber == null) {
			if (other.itemnumber != null)
				return false;
		} else if (!itemnumber.equals(other.itemnumber))
			return false;
		if (Double.doubleToLongBits(norm) != Double.doubleToLongBits(other.norm))
			return false;
		if (Double.doubleToLongBits(normnumber) != Double.doubleToLongBits(other.normnumber))
			return false;
		if (Double.doubleToLongBits(number) != Double.doubleToLongBits(other.number))
			return false;
		if (paymentstatus == null) {
			if (other.paymentstatus != null)
				return false;
		} else if (!paymentstatus.equals(other.paymentstatus))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (purchaseid == null) {
			if (other.purchaseid != null)
				return false;
		} else if (!purchaseid.equals(other.purchaseid))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (unitName == null) {
			if (other.unitName != null)
				return false;
		} else if (!unitName.equals(other.unitName))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", purchaseid=" + purchaseid + ", departmentname=" + departmentname
				+ ", username=" + username + ", applytime=" + applytime + ", goodsname=" + goodsname + ", brands="
				+ brands + ", itemnumber=" + itemnumber + ", catalogprice=" + catalogprice + ", actualprice="
				+ actualprice + ", number=" + number + ", price=" + price + ", unitName=" + unitName + ", norm=" + norm
				+ ", normnumber=" + normnumber + ", company=" + company + ", function=" + function + ", invoicestatus="
				+ invoicestatus + ", paymentstatus=" + paymentstatus + ", status=" + status + ", remark=" + remark
				+ ", invertoryid=" + invertoryid + ", descritpion=" + descritpion + ", category=" + category
				+ ", inventoryNum=" + inventoryNum + ", inventory=" + inventory + "]";
	}
	
}
