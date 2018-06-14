package com.frasergen.entity;

public class Share {
	private int user_id;
	private String full_name;//姓名
	private String name;//账号
	private int role_id;// 角色id
	private String author;//角色名称ROLE_xxxx
	private int department_id;//部门编号
	public Share() {
		super();
	}
	
	

	public Share(int user_id, String full_name, String name, int role_id, String author, int department_id) {
		super();
		this.user_id = user_id;
		this.full_name = full_name;
		this.name = name;
		this.role_id = role_id;
		this.author = author;
		this.department_id = department_id;
	}
	


	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + department_id;
		result = prime * result + ((full_name == null) ? 0 : full_name.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Share other = (Share) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (department_id != other.department_id)
			return false;
		if (full_name == null) {
			if (other.full_name != null)
				return false;
		} else if (!full_name.equals(other.full_name))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (role_id != other.role_id)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Share [user_id=" + user_id + ", full_name=" + full_name + ", name=" + name + ", role_id=" + role_id
				+ ", author=" + author + ", department_id=" + department_id + "]";
	}
	
	
	
}
