package com.example;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document htmlDoc = new HTMLDocument();
		htmlDoc.setContents("prueba");
		htmlDoc.displayContents();
		
		Document textDoc = new TextDocument();
		textDoc.setContents("Esto es un documento");
		textDoc.displayContents();
	}

}
