package com.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogFile log = new HTTPLogFile("example.com");
		
		
		log.writeLog("index.html");
	}

}
