package com.proj.Rectangle;


public class Rectangle {
	int length;
	int breadth;
	int area;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public int calcArea() {
		return this.area= length*breadth;
	}
	public int calcPerimeter() {
		return 2*(length*breadth);
	}
	
	public Rectangle() {
		}
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

}
