package com.example;

public class Greet {

	private String greeting;
	private String recipient;

	public Greet() {
		greeting   = "Hello";
		recipient  = "World";
	}
	
	
	public void printGreeting() {
		System.out.println(greeting+", "+recipient+"!");
	}
	

	public void setGreetingRecipient(String greeting, String recipient) {
		this.greeting  = greeting;
		this.recipient = recipient;
	}	
	
	public void setGreetingRecipient(String greeting) {
		this.greeting  = greeting;
	}
	
	
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	
}
