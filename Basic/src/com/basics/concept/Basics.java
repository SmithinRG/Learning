package com.basics.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.testng.annotations.Test;

public class Basics {
	
	@Test
	public void learning() {
		ArrayList<String> cars = new ArrayList<String>();
		//to add objects in arraylist
		cars.add("Tiago");
		cars.add("Baleno");
		cars.add("Maruti");
		cars.add("HondaCity");
		//cars.remove(1);// to remove object from array
		//cars.clear;// to clear all object from array
		cars.set(2, "Wagnor");//to add new object by replacing the existing one using the index
		cars.size();//to get the array size
		System.out.println(cars);// to print all array objects 
		System.out.println(cars.get(2));// to get the object from array using index
		//System.out.println();
		
		//sort an arraylist
		Collections.sort(cars);
		
		//for loop
		for(int i=0;i<cars.size();i++) {
			System.out.println("FOR LOOP:"+cars.get(i));
		}
		
		//for each
		for(String i:cars) {
			System.out.println("FOR EACH: "+i);
		}
		
		//Create an ArrayList to store numbers (add elements of type Integer):
		//Note:Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
		
		ArrayList<Integer> table = new ArrayList<Integer>();
		table.add(2);
		table.add(4);
		table.add(55);
		table.add(22);
		//System.out.println(table);
		
		//for each
		for(int i:table) {
			System.out.println(i);
		}
		
		
		//HASH MAP
		//Create hashmap,store items in "key/value" pairs,
		HashMap<String, String> office = new HashMap<String, String>();
		
		//to add items to it, use the put() method:
		office.put("Employer", "XYZ");
		office.put("Developer", "Smithin");
		office.put("Tester", "Tijo");
		office.put("Manager", "Sumitha");
		System.out.println(office);
		
		//use the get() method and refer to its key:
		System.out.println("GET:"+office.get("Developer"));
		
		//Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
		for(String i:office.keySet()) {
			System.out.println("Key"+i);
		}
		//for Values
		for(String i:office.values()) {
			System.out.println("Values"+i);
		}
		//for key and values
		for(String i:office.keySet()) {
			System.out.println("Key"+i+"Values"+office.get(i));
		}
		
		
		//Create a HashMap object called people that will store String keys and Integer values:
		
		HashMap<String, Integer> school = new HashMap<String, Integer>();
		school.put("Smith", 33);
		school.put("John", 30);
		
		for(String i:school.keySet()) {
			System.out.println("Key: "+i+"values:"+school.get(i));
		}
		
		//String reverse--we can use--StringBuffer,StringBuilder,Iteration
		String st = "the world is not enough";
//		StringBuffer sb = new StringBuffer(st);
//		sb.reverse();
//		System.out.println(sb);
//Another method for reverse using iteration
		char ch[] = st.toCharArray();
		String ss="";
		for(int i=st.length()-1;i>0;i--) {
		ss+=ch[i];
			
		}
		System.out.println(ss);
		
		///TEST
		String test = "200";
		int pointscount = Integer.parseInt(test);
		int pointExceed = pointscount+1;
		String pointExceeding = String.valueOf(pointExceed);
		System.out.println("PPPP"+pointExceeding);
	//char to string conversion	
		String chr = "last and chars";
		char dd = chr.charAt(0);
		String ee = String.valueOf(dd);
		char hh = chr.charAt(13);
		StringBuilder str = new StringBuilder(ee);
		str.append(hh);
		str.append('@');
		
		System.out.println(str);
		System.out.println("Test");
		
		
	
		
		
	}
//	lastChars("last", "chars") → "ls"
//	lastChars("yo", "java") → "ya"
//	lastChars("hi", "") → "h@"
	

	//char ch[] = ss.toCharArray();

	
	
}
