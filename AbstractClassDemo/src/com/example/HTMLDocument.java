package com.example;


public class HTMLDocument extends Document{
	private String header;
	
	public HTMLDocument() {
		this.setFileName("untitled.txt");
	}
	
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@Override
	public void displayContents() {
		// TODO Auto-generated method stub
		System.out.println("prueba: "+header);
	}


	
}
