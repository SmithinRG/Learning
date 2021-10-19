package com.basics.concept;

import org.testng.annotations.Test;

public class TestHouse {
	
	@Test
	public void learning() {
		////////////////////////////////
		//	swap variable without third vairable
			int a = 13;
			int b = 14;
			
			a = a+b;//13+14 =27
			b = a-b;//27-14 =13
			a = a-b;//27-13
			System.out.println("Swap:B= "+b+"Swap:A="+a);
			
			
//			swap variable two numbers
					int c = 13;
					int d = 14;
					
					int temp = c;//13
					c = d;//14
					d = temp;//13
					
					System.out.println("Swap:D= "+d+"Swap:C="+c);
					
					//Ternary operator
					
					int q = -2;
					//String result = (q>0)?"Positive": "Negative";
					String result = (q>0)?"Positive": (q<0)?"Negative": "Zero";
					System.out.println(result);
					
					
	}

}
