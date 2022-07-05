package com.bridgelabzaddressbook;

public class Contact {
	
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private int zip;
	private String state;
	private long phone;
	private String email;
	
	public Contact(String fname,String lname,String address,String city,String state,int zip,long phone,String email) {
		this.firstname=fname;
		this.lastname=lname;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phone=phone;
		this.email=email;
	}
	
	@Override
	
	public String toString()
	{
		return "First name is:"+firstname+"\nLastName is: "+lastname+"\nAddress is: "+address+"\nCity is: "+city+"\nZip is:"+zip+"\n State is:"+state+"\nPhone Number is:"
	+phone+"\nEmail is: "+email;
				 
	}
	public String getFirstName() {
		
		return null;
	}

}
