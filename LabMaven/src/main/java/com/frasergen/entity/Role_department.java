package com.frasergen.entity;

public class Role_department {
	private int department_id;
	private int charge_position;//收费ID
	private String description;
	private String name;
	private int parent_id;//上级部门ID
	public Role_department() {
		super();
	}
	public Role_department(int department_id, int charge_position, String description, String name, int parent_id) {
		super();
		this.department_id = department_id;
		this.charge_position = charge_position;
		this.description = description;
		this.name = name;
		this.parent_id = parent_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getCharge_position() {
		return charge_position;
	}
	public void setCharge_position(int charge_position) {
		this.charge_position = charge_position;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		result = prime * result + charge_position;
		result = prime * result + department_id;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + parent_id;
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
		Role_department other = (Role_department) obj;
		if (charge_position != other.charge_position)
			return false;
		if (department_id != other.department_id)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parent_id != other.parent_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Role_department [department_id=" + department_id + ", charge_position=" + charge_position
				+ ", description=" + description + ", name=" + name + ", parent_id=" + parent_id + "]";
	}
	
}
