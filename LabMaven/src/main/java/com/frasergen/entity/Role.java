package com.frasergen.entity;

public class Role {
	private int position_id;
	private int user_id;
	private int role_id;
	private String name;
	private String description;
	public Role() {
		super();
	}
	
	public Role(int position_id, int user_id, int role_id, String name, String description) {
		super();
		this.position_id = position_id;
		this.user_id = user_id;
		this.role_id = role_id;
		this.name = name;
		this.description = description;
	}

	public int getPosition_id() {
		return position_id;
	}
	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
		result = prime * result + position_id;
		result = prime * result + role_id;
		result = prime * result + user_id;
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
		if (position_id != other.position_id)
			return false;
		if (role_id != other.role_id)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Role [position_id=" + position_id + ", user_id=" + user_id + ", role_id=" + role_id + ", name=" + name
				+ ", description=" + description + "]";
	}

	
	
}
