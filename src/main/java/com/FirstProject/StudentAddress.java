package com.FirstProject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class StudentAddress {
     
	@Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column (name = "address_id")
	
	private int AddressId;
     
	@Column(length = 50, name="STREET")
	
	private String Street;
	
	@Column (length = 50)
	
	private String City;
	
	@Column (name = "added_date")
	@Temporal (TemporalType.DATE)
	
	private Date addedDate;
	
	@Lob
	
	private byte [] image;
    
	@Column(name = "isOpen")
	private boolean isOpen;
	
	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentAddress(int addressId, String street, String city, Date addedDate, byte[] image) {
		super();
		AddressId = addressId;
		Street = street;
		City = city;
		this.addedDate = addedDate;
		this.image = image;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public StudentAddress(boolean isOpen) {
		super();
		this.isOpen = isOpen;
	}
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	
}
