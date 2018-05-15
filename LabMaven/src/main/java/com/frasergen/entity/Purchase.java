package com.frasergen.entity;

import java.util.Date;

public class Purchase {
	private int id;
	private int purchaseid;
	private int userid;
	private Date applytime;
	private int goodsid;
	private double number;
	private int unitid;
	private double catalogprice;
	private double actualprice;
	private String function;
	private String remark;
	public Purchase() {
		super();
	}
	
	public Purchase(int id, int purchaseid, int userid, Date applytime, int goodsid, double number, int unitid,
			double catalogprice, double actualprice, String function, String remark) {
		super();
		this.id = id;
		this.purchaseid = purchaseid;
		this.userid = userid;
		this.applytime = applytime;
		this.goodsid = goodsid;
		this.number = number;
		this.unitid = unitid;
		this.catalogprice = catalogprice;
		this.actualprice = actualprice;
		this.function = function;
		this.remark = remark;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getApplytime() {
		return applytime;
	}
	public void setApplytime(Date applytime) {
		this.applytime = applytime;
	}
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
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
		long temp;
		temp = Double.doubleToLongBits(actualprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((applytime == null) ? 0 : applytime.hashCode());
		temp = Double.doubleToLongBits(catalogprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((function == null) ? 0 : function.hashCode());
		result = prime * result + goodsid;
		result = prime * result + id;
		temp = Double.doubleToLongBits(number);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + purchaseid;
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + unitid;
		result = prime * result + userid;
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
		Purchase other = (Purchase) obj;
		if (Double.doubleToLongBits(actualprice) != Double.doubleToLongBits(other.actualprice))
			return false;
		if (applytime == null) {
			if (other.applytime != null)
				return false;
		} else if (!applytime.equals(other.applytime))
			return false;
		if (Double.doubleToLongBits(catalogprice) != Double.doubleToLongBits(other.catalogprice))
			return false;
		if (function == null) {
			if (other.function != null)
				return false;
		} else if (!function.equals(other.function))
			return false;
		if (goodsid != other.goodsid)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(number) != Double.doubleToLongBits(other.number))
			return false;
		if (purchaseid != other.purchaseid)
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (unitid != other.unitid)
			return false;
		if (userid != other.userid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", purchaseid=" + purchaseid + ", userid=" + userid + ", applytime=" + applytime
				+ ", goodsid=" + goodsid + ", number=" + number + ", unitid=" + unitid + ", catalogprice="
				+ catalogprice + ", actualprice=" + actualprice + ", function=" + function + ", remark=" + remark + "]";
	}
	
}
