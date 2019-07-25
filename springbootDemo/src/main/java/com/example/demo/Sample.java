package com.example.demo;

public class Sample {
private int sno;
private String sname;
private int age;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Sample(int sno,String sname,int age){
	this.sno=sno;
	this.sname=sname;
	this.age=age;
}
public Sample() {
	super();
}


}
