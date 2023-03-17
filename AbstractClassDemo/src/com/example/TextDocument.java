package com.example;


public class TextDocument extends Document{

	public TextDocument() {
		this.setFileName("untitled.txt");
	}

	@Override
	public void displayContents() {
		// TODO Auto-generated method stub
		System.out.println(getContents());
		
	}
	

}
