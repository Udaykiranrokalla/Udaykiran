package com.example.demo;

public class Pojo {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	  public Pojo() {
		  super();
	  }
		
	public Pojo(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
}
