package com.bridgelabz.addressbook.Services;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.addressbook.Model.ContactInfo;

public class UserInterface {
	
	ScannerUtility scn = new ScannerUtility();
	
	private UserInterface() {
		
	}
	
	private static UserInterface instance;
	
	public static UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}
	
	public void print(ArrayList<ContactInfo> contactList) {
		for(Object contact : contactList) {
			System.out.println(contact);
		}
	}
	
	public int showMainMenu() {
		System.out.println("select \n 1. Add Contact \n 2.Edit Contact \n 3.Delete Contact "
				+ "\n 4.Display Contact List \n 5.Exit");
		int choice = scn.IntegerInput();
		return choice;
	}
	
	public String selectContact() {
		System.out.println("Enter the first name of contact :");
		String userSelection = scn.StringInput();
		return userSelection;
	}
	
	public int showUpdateMenu() {
		System.out.println("Select \n1. Update First Name \n2. Update Second Name \n3. Update Address "
				+ "\n4. Update City Name \n5. Update State name \n6. Update Zip Code "
				+ "\n7. Update Phone Number \n8. Update email Address \n9. Exit");
		int updateChoice = scn.IntegerInput();
		return updateChoice;
	}

}


