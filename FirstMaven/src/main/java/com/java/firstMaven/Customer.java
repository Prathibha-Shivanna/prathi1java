package com.java.firstMaven;

public class Customer {
	int cstId;
	String cstName;
	Long cstContact;
	Address address;
	
	
	public int getCstId() {
		return cstId;
	}

	public void setCstId(int cstId) {
		this.cstId = cstId;
	}

	public String getCstName() {
		return cstName;
	}

	public void setCstName(String cstName) {
		this.cstName = cstName;
	}

	public Long getCstContact() {
		return cstContact;
	}

	public void setCstContact(Long cstContact) {
		this.cstContact = cstContact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	public void  display()  {
      System.out.println("Customer ID: "+cstId+"\n"+"Customer Name"+"\n"+ cstName+"Customer Contact"+"\n"+cstContact+"\n"+"Customer address  "+address);
	}

}
