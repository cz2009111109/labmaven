package com.frasergen.entity;

public class Goods {
	private int goodsid;//物品id
	private String name;//物品名称
	private String brands;//品牌
	private int supplierid;//供应商id
	private String function;//功能
	private double stocknumber;//数量
	private String itemnumber;//货号
	private String norm;//规格单位
	private int unitid;//单位
	public Goods() {
		super();
	}
	
	
	


	public Goods(int goodsid, String name, String brands, int supplierid, String function, double stocknumber,
			String itemnumber, String norm, int unitid) {
		super();
		this.goodsid = goodsid;
		this.name = name;
		this.brands = brands;
		this.supplierid = supplierid;
		this.function = function;
		this.stocknumber = stocknumber;
		this.itemnumber = itemnumber;
		this.norm = norm;
		this.unitid = unitid;
	}

	
	public String getNorm() {
		return norm;
	}





	public void setNorm(String norm) {
		this.norm = norm;
	}





	public String getItemnumber() {
		return itemnumber;
	}


	public void setItemnumber(String itemnumber) {
		this.itemnumber = itemnumber;
	}


	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrands() {
		return brands;
	}
	public void setBrands(String brands) {
		this.brands = brands;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public double getStocknumber() {
		return stocknumber;
	}
	public void setStocknumber(double stocknumber) {
		this.stocknumber = stocknumber;
	}
	public int getUnitid() {
		return unitid;
	}
	public void setUnitid(int unitid) {
		this.unitid = unitid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brands == null) ? 0 : brands.hashCode());
		result = prime * result + ((function == null) ? 0 : function.hashCode());
		result = prime * result + goodsid;
		result = prime * result + ((itemnumber == null) ? 0 : itemnumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((norm == null) ? 0 : norm.hashCode());
		long temp;
		temp = Double.doubleToLongBits(stocknumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + supplierid;
		result = prime * result + unitid;
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
		Goods other = (Goods) obj;
		if (brands == null) {
			if (other.brands != null)
				return false;
		} else if (!brands.equals(other.brands))
			return false;
		if (function == null) {
			if (other.function != null)
				return false;
		} else if (!function.equals(other.function))
			return false;
		if (goodsid != other.goodsid)
			return false;
		if (itemnumber == null) {
			if (other.itemnumber != null)
				return false;
		} else if (!itemnumber.equals(other.itemnumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (norm == null) {
			if (other.norm != null)
				return false;
		} else if (!norm.equals(other.norm))
			return false;
		if (Double.doubleToLongBits(stocknumber) != Double.doubleToLongBits(other.stocknumber))
			return false;
		if (supplierid != other.supplierid)
			return false;
		if (unitid != other.unitid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Goods [goodsid=" + goodsid + ", name=" + name + ", brands=" + brands + ", supplierid=" + supplierid
				+ ", function=" + function + ", stocknumber=" + stocknumber + ", itemnumber=" + itemnumber + ", norm="
				+ norm + ", unitid=" + unitid + "]";
	}
	
	
	
}
