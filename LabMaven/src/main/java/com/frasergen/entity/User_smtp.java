package com.frasergen.entity;

public class User_smtp {
	private int smtp_id;
	private String name;
	private int user_id;
	private String server;
	private String password;
	private int number;
	public User_smtp() {
		super();
	}
	public User_smtp(int smtp_id, String name, int user_id, String server, String password, int number) {
		super();
		this.smtp_id = smtp_id;
		this.name = name;
		this.user_id = user_id;
		this.server = server;
		this.password = password;
		this.number = number;
	}
	public int getSmtp_id() {
		return smtp_id;
	}
	public void setSmtp_id(int smtp_id) {
		this.smtp_id = smtp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((server == null) ? 0 : server.hashCode());
		result = prime * result + smtp_id;
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
		User_smtp other = (User_smtp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (server == null) {
			if (other.server != null)
				return false;
		} else if (!server.equals(other.server))
			return false;
		if (smtp_id != other.smtp_id)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User_smtp [smtp_id=" + smtp_id + ", name=" + name + ", user_id=" + user_id + ", server=" + server
				+ ", password=" + password + ", number=" + number + "]";
	}
	
}
