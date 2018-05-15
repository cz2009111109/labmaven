package com.frasergen.entity;

import java.util.Date;

public class User {
	private int user_id;
	private String name;
	private int state;
	private String full_name;
	private String password;
	private int sex;
	private String telephone;
	private Date birthday;
	private String address;
	private String qq;
	private int token_time;
	private String token;
	private String email;
	
	public User() {
		super();
	}
	public User(int user_id, String name, int state, String full_name, String password, int sex, String telephone,
			Date birthday, String address, String qq, int token_time, String token, String email) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.state = state;
		this.full_name = full_name;
		this.password = password;
		this.sex = sex;
		this.telephone = telephone;
		this.birthday = birthday;
		this.address = address;
		this.qq = qq;
		this.token_time = token_time;
		this.token = token;
		this.email = email;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public int getToken_time() {
		return token_time;
	}
	public void setToken_time(int token_time) {
		this.token_time = token_time;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((full_name == null) ? 0 : full_name.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((qq == null) ? 0 : qq.hashCode());
		result = prime * result + sex;
		result = prime * result + state;
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result + token_time;
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
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
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
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (qq == null) {
			if (other.qq != null)
				return false;
		} else if (!qq.equals(other.qq))
			return false;
		if (sex != other.sex)
			return false;
		if (state != other.state)
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (token_time != other.token_time)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", state=" + state + ", full_name=" + full_name
				+ ", password=" + password + ", sex=" + sex + ", telephone=" + telephone + ", birthday=" + birthday
				+ ", address=" + address + ", qq=" + qq + ", token_time=" + token_time + ", token=" + token + ", email="
				+ email + "]";
	}
	
}
