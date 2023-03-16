package com.example;

public class LogFile {

	private String fileName = "prueba.log";

	private String filePath = "C:\\Users\\KSOLIS\\eclipse-workspace";
	
	public LogFile() {
		System.out.println("default constructor");
	}

	public LogFile(String fileName, String filePath) {
		System.out.println("Parameterized constructor");
		this.fileName = fileName;
		this.filePath = filePath;
	}
	
	public void writeLog(String line) {
		System.out.println("Route: " + filePath+" "+fileName+" - "+line);
	}
	
	
}
