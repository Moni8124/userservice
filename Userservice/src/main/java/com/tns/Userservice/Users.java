package com.tns.Userservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	private Integer U_id;
	private String U_name;
	private Integer U_password;
	
	public Users() {
		super();
	}
	
	public Users(Integer U_id, String U_name, Integer U_password) {
		super();
		this.U_id = U_id;
		this.U_name = U_name;
		this.U_password = U_password;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getU_id() {
		return U_id;
	}
	public void setU_id(Integer U_id) {
		this.U_id = U_id;
	}
	public String getU_name() {
		return U_name;
	}
	public void setU_name(String U_name) {
		this.U_name = U_name;
	}
	public Integer getU_password() {
		return U_password;
	}
	public void setU_password(Integer U_password) {
		this.U_password = U_password;
	}
	@Override
	public String toString()
	{
		return "Users[Users id:"+U_id+" Users name"+U_name+" Users password"+U_password+"]";
	}
}
