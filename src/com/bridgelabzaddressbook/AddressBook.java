package com.bridgelabzaddressbook;

import java.util.Scanner;

public class AddressBook {
		
		public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");
		AddressBookService.addContact();
		AddressBookService.display();
		AddressBookService.deleteContact();
		
	}
}
