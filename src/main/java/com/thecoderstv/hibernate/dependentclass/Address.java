package com.thecoderstv.hibernate.dependentclass;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	String city;
	String country;
	String pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}

}
