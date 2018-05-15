package com.frasergen.entity;

public class Unit {
	private int unitid;
	private String unitName;
	private String description;
	private int parent_id;
	public Unit() {
		super();
	}
	public Unit(int unitid, String unitName, String description, int parent_id) {
		super();
		this.unitid = unitid;
		this.unitName = unitName;
		this.description = description;
		this.parent_id = parent_id;
	}
	public int getUnitid() {
		return unitid;
	}
	public void setUnitid(int unitid) {
		this.unitid = unitid;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + parent_id;
		result = prime * result + ((unitName == null) ? 0 : unitName.hashCode());
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
		Unit other = (Unit) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (parent_id != other.parent_id)
			return false;
		if (unitName == null) {
			if (other.unitName != null)
				return false;
		} else if (!unitName.equals(other.unitName))
			return false;
		if (unitid != other.unitid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SampleUnit [unitid=" + unitid + ", unitName=" + unitName + ", description=" + description
				+ ", parent_id=" + parent_id + "]";
	}
	
}
