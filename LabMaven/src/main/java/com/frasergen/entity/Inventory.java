package com.frasergen.entity;

import java.util.List;

public class Inventory {
	private int id;//库存id
	private String name; //库存名称，即货物名称
	private String description;
	private double inventoryNum;//库存数量
	private String remark;//备注
	private List<Commodity> commoditys;
	public Inventory() {
		super();
	}
	public Inventory(int id, String name, String description, List<Commodity> commoditys) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.commoditys = commoditys;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Commodity> getCommoditys() {
		return commoditys;
	}
	public void setCommoditys(List<Commodity> commoditys) {
		this.commoditys = commoditys;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commoditys == null) ? 0 : commoditys.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Inventory other = (Inventory) obj;
		if (commoditys == null) {
			if (other.commoditys != null)
				return false;
		} else if (!commoditys.equals(other.commoditys))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", description=" + description + ", commoditys=" + commoditys
				+ "]";
	}
	
	
}
