package com.proj.Rectanglemain;

import com.proj.Rectangle.Rectangle;

public class AreaCalculatorManager {
	
	public void printAreaofObjects(Rectangle objects[]) {
        
		objects= new Rectangle[5];
		
		for(int i=0; i<5; i++)
		{
			objects[i] = new Rectangle();
			objects[i].calcArea();
		}
		
		
	}
	
}

