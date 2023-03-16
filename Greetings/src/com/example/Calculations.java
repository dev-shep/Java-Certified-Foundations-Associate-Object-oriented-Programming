package com.example;

public class Calculations {

	public int x1,y1;

	public Calculations(int x1, int y1) {
		super();
		this.x1 = x1;
		this.y1 = y1;
	}
	
	public void sum() {
		int sum = x1 + y1;
		
		System.out.println("La suma es: "+sum);
	}
	
	public int sum1() {
		int sum = x1+y1;
		return sum;
	}
}
