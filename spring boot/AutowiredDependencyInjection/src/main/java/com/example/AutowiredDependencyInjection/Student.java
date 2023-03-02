package com.example.AutowiredDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {

	private int sid;
	private String Sname;
	private String Tech;
	
	@Autowired						//Search by type
	@Qualifier("lap1")				//Search by name
	private laptop laptop;
	

	public Student() {
		super();
		System.out.println("object Created...");
	}

	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getTech() {
		return Tech;
	}
	public void setTech(String tech) {
		Tech = tech;
	}
	
	public laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(laptop laptop) {
		this.laptop = laptop;
	}
	public void show()
	{
		System.out.println("In Show");
		laptop.compile();
	}
}
