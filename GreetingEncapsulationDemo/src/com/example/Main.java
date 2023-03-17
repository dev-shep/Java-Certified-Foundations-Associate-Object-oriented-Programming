package com.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Greet message = new Greet();
		message.printGreeting();
		
		message.setGreeting("hi");
		message.printGreeting();
		
		message.setRecipient("Steve");
		message.printGreeting();
		

		message.setGreetingRecipient("Goodbye","Mallory");
		message.printGreeting();
	}

}
