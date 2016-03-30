package com.marlabs.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadObject {
	FileInputStream fis;
	ObjectInputStream ois;
	
	ReadObject(){
		try{
		fis = new FileInputStream("src/obj.txt");
		ois = new ObjectInputStream(fis);
		Book temp = (Book) ois.readObject();
		System.out.println("From file" +temp);
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				ois.close();
				fis.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReadObject();
	}

}
