package com.frasergen.entity;

public class Role {
	private int department_id; //角色部门位置id
	private int role_id; //角色id
	private String name; //角色姓名
	private String description; //角色描述
	public Role() {
		super();
	}
	
	public Role(int department_id, int role_id, String name, String description) {
		super();
		this.department_id = department_id;
		this.role_id = role_id;
		this.name = name;
		this.description = description;
	}

	public int getdepartment_id() {
		return department_id;
	}
	public void setdepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + department_id;
		result = prime * result + role_id;
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
		Role other = (Role) obj;
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
		if (department_id != other.department_id)
			return false;
		if (role_id != other.role_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Role [department_id=" + department_id + ", role_id=" + role_id + ", name=" + name
				+ ", description=" + description + "]";
	}

	
	
}
