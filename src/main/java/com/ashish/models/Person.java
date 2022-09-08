package com.ashish.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person 
{
	@Id
	private int pid;
	private String name;
	private String city;
	public Person() {}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
	}
	
}
