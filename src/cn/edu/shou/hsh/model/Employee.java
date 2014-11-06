package cn.edu.shou.hsh.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class Employee {
	
	private String name;
	private String number;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}
