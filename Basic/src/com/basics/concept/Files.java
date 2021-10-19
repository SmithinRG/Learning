package com.basics.concept;

import java.io.File;
import java.io.FileWriter;

public class Files {

	public static void Create() {
		try {
			File create = new File("/Users/thi1907501/eclipse-workspace/Basic/CreateFile.txt");
			if(create.createNewFile()) {
				System.out.println("File Created: "+create.getName());
			}else {
				System.out.println("File Already Exist");
			}
		}catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	public static void Write() {
		try {
			FileWriter myWrite = new FileWriter("/Users/thi1907501/eclipse-workspace/Basic/CreateFile.txt");
			myWrite.write("How are you Devayani?");
			myWrite.close();
			System.out.println("Write Success");
		}catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Create();
		Write();
	}
}