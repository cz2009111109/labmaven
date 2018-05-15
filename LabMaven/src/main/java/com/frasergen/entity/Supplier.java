package com.frasergen.entity;

public class Supplier {
	private int supplierid;
	private String company;
	private String name;
	private String qq;
	private String email;
	private String phone;
	private String address;
	private String weixin;
	public Supplier() {
		super();
	}
	public Supplier(int supplierid, String company, String name, String qq, String email, String phone, String address,
			String weixin) {
		super();
		this.supplierid = supplierid;
		this.company = company;
		this.name = name;
		this.qq = qq;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.weixin = weixin;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((qq == null) ? 0 : qq.hashCode());
		result = prime * result + supplierid;
		result = prime * result + ((weixin == null) ? 0 : weixin.hashCode());
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
		Supplier other = (Supplier) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (qq == null) {
			if (other.qq != null)
				return false;
		} else if (!qq.equals(other.qq))
			return false;
		if (supplierid != other.supplierid)
			return false;
		if (weixin == null) {
			if (other.weixin != null)
				return false;
		} else if (!weixin.equals(other.weixin))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Supplier [supplierid=" + supplierid + ", company=" + company + ", name=" + name + ", qq=" + qq
				+ ", email=" + email + ", phone=" + phone + ", address=" + address + ", weixin=" + weixin + "]";
	}
	
}
