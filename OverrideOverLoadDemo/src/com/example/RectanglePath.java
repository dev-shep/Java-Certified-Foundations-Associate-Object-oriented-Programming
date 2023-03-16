package com.example;

public class RectanglePath extends Path{
    private double width,height;
    
    
	public RectanglePath(double width, double heigth) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public double distance() {
		 
		return 2.0 *(width + height);
	}

}
