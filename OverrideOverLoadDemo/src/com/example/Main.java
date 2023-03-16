package com.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path circle = new CirclePath(5);
		System.out.println("Main.main()"+ circle.distance());
		
		
		Path rectangle = new RectanglePath(5,5);
		System.out.println("Main.main()"+ rectangle.distance());
	}

}
