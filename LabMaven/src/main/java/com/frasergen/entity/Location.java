package com.frasergen.entity;

/**
 * 仓库位置
 * @author Administrator
 * @version 1.0.0
 * @since
 * 创建时间:2018年7月17日
 * 官方网站：www.frasergen.com
 */
public class Location {
	private int locationId;//储存位置id
	private String name; //存储位置名称
	private String description;//存储位置描述
	
	
	public Location() {
		super();
	}

	public Location(int locationId, String name, String description) {
		super();
		this.locationId = locationId;
		this.name = name;
		this.description = description;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + locationId;
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
		Location other = (Location) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (locationId != other.locationId)
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
		return "Location [locationId=" + locationId + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
}
