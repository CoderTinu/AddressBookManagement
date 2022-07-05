package com.bridgelabzaddressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookService {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Contact> arrayOfContacts = new ArrayList<Contact>();
	public static void addContact()
	{
		System.out.println("Please Enter your first name:");
		String firstname =sc.next();
		System.out.println("Please Enter your last name:");
		String lastname=sc.next();
		System.out.println("Please enter your address:");
		String address = sc.next();
		System.out.println("Plese Enter city:");
		String city = sc.next();
		System.out.println("Please Enter State: ");
		String state = sc.next();
		System.out.println("Please enter zip code: ");
		int zip = sc.nextInt();
		System.out.println("Please enter phone number");
		long phone =sc.nextLong();
		System.out.println("Please enter email id: ");
		String email = sc.next();
		
		Contact c= new Contact(firstname,lastname,address,city,state,zip,phone,email);
		arrayOfContacts.add(c);
	}
	
	public static void display()
	{
		for (Contact c:arrayOfContacts) {
			System.out.println(c);
		}
	}
	
	private static int edit(String editName)
	{
		for (Contact contact : arrayOfContacts) {
			if(editName.compareToIgnoreCase(contact.getFirstName())==0) {
				return arrayOfContacts.indexOf(contact);
			}
			
		}
		
		return -1;
	}
	public static void editContact()
	{
		System.out.println("Enter the name you want to edit");
		String editName=sc.next();
		int ans = edit(editName);
		if(ans== -1)
		{
			System.out.println("Contact with name"+editName+" not found");
			
		}
		else
		{
			System.out.println("Found the contact\nplease edit the details:");
			addContact();
		}
	}
}
