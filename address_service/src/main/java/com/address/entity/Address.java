package com.address.entity;

public class Address {

	private String address_lineone;
	private String address_linetwo;
	private String address_city;
	private String state;
	private int pincode;
	private Long userId;
	

	public Address(String address_lineone, String address_linetwo, String address_city, String state, int pincode,
			Long userId) {
		super();
		this.address_lineone = address_lineone;
		this.address_linetwo = address_linetwo;
		this.address_city = address_city;
		this.state = state;
		this.pincode = pincode;
		this.userId = userId;
	}


	public String getAddress_lineone() {
		return address_lineone;
	}


	public void setAddress_lineone(String address_lineone) {
		this.address_lineone = address_lineone;
	}


	public String getAddress_linetwo() {
		return address_linetwo;
	}


	public void setAddress_linetwo(String address_linetwo) {
		this.address_linetwo = address_linetwo;
	}


	public String getAddress_city() {
		return address_city;
	}


	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Address() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
