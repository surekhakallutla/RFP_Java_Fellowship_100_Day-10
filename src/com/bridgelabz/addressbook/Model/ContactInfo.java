package com.bridgelabz.addressbook.Model;

public class ContactInfo {
	
	public String fname;
	public String lname;
	public String address;
	public String city;
	public String state;
	public long zip;
	public long phonenumber;
	public String email;
	
	@Override
	public String toString() {
		return "Contact [fname=" + fname + ", lname=" + lname + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phonenumber=" + phonenumber + ", email=" + email + "]";
	}
	
}
