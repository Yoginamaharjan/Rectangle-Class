package com.proj.Rectanglemain;

import com.proj.Rectangle.Rectangle;

public class Recmain {

	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle();
		//R1.calcArea();
		System.out.println("The area of the rectangle R1 is " +R1.calcArea());
		System.out.println("The perimeter of the rectangle R1 is " +R1.calcPerimeter());

		Rectangle R2 = new Rectangle(5,7);
		System.out.println("The area of the rectangle is R2 " + R2.calcArea());
		System.out.println("The perimeter of the rectangle is R2 " +R2.calcPerimeter());
		
		Rectangle[] RecArray = new Rectangle[5];
		
		for(int i=0; i<5; i++)
		{
			RecArray[i] = new Rectangle();
			RecArray[i].calcArea();
		}

	}

}
