package com.FirstProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	@Column(name = "Student_name")
	private String Name;
	
	private String address;	
	
	private int mobileno;
	
	private String FatherName;
	
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public Student(int mobileno, String fatherName) {
		super();
		this.mobileno = mobileno;
		FatherName = fatherName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Cerificate certi;
	
	public Cerificate getCerti() {
		return certi;
	}
	public void setCerti(Cerificate certi) {
		this.certi = certi;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Student [sid=" + sid + ", Name=" + Name + ", address=" + address + "]";
//	}
	
	
}
