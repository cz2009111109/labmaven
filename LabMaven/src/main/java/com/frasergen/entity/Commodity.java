package com.frasergen.entity;

public class Commodity {
	private int id; //主键
	private String purchaseid;//申请单号
	private String departmentname;//申请部门名称
	private String username;//申请人
	private String applytime;//申购日期
	private String goodsname;//物品名称
	private String brands;//品牌
	private String itemnumber;//货号
	private double catalogprice;//目录价格
	private double actualprice;//采购价格
	private double number;//采购数量
	private double price;//总价
	private String unitName;//规格单位
	private double normnumber;//标准数量
	private double norm;//规格数量
	private String function;//用途
	private String state;//状态
	private String remark;//备注
	public Commodity() {
		super();
	}
	
	public Commodity(int id, String purchaseid, String departmentname, String username, String applytime,
			String goodsname, String brands, String itemnumber, double catalogprice, double actualprice, double number,
			double price, String unitName, double normnumber, double norm, String function, String remark) {
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
		this.normnumber = normnumber;
		this.norm = norm;
		this.function = function;
		this.remark = remark;
	}





	public double getNormnumber() {
		return normnumber;
	}





	public void setNormnumber(double normnumber) {
		this.normnumber = normnumber;
	}





	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
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
	public String getName() {
		return departmentname;
	}
	public void setName(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getApplytime() {
		return applytime;
	}
	public void setApplytime(String applytime) {
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
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
		result = prime * result + ((departmentname == null) ? 0 : departmentname.hashCode());
		result = prime * result + ((function == null) ? 0 : function.hashCode());
		result = prime * result + ((goodsname == null) ? 0 : goodsname.hashCode());
		result = prime * result + id;
		result = prime * result + ((itemnumber == null) ? 0 : itemnumber.hashCode());
		temp = Double.doubleToLongBits(norm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(normnumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(number);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((purchaseid == null) ? 0 : purchaseid.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
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
		if (departmentname == null) {
			if (other.departmentname != null)
				return false;
		} else if (!departmentname.equals(other.departmentname))
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
				+ actualprice + ", number=" + number + ", price=" + price + ", unitName=" + unitName + ", normnumber="
				+ normnumber + ", norm=" + norm + ", function=" + function + ", remark=" + remark + "]";
	}
	
	
}
