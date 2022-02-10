package com.bridgelabz.addressbook.Services;

import java.util.*;

import com.bridgelabz.addressbook.Model.ContactInfo;

public class ContactController {
	
	private ArrayList<ContactInfo> contactList = new ArrayList<ContactInfo> ();

	private ContactController() {
		
	}
	
	private static ContactController instance;
	
	public static ContactController getInstance() {
		if(instance == null) {
			instance = new ContactController();
		}
		return instance;
	}
	
	public ArrayList<ContactInfo> getContactList() {
		return contactList;
	}
	
	public void add(ContactInfo contact)
	{
		contactList.add(contact);		
	}
		
	public void remove(ContactInfo contact)
	{
		contactList.remove(contact);	
	}
		
	public ContactInfo getContact(String firstName) {
		for(ContactInfo contact : contactList) {
			if(firstName.equalsIgnoreCase(contact.fname)) {
				return contact;
			}
		}
		return null;
	}
		
}
