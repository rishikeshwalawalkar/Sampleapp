package com.marlabs.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjects {
	FileOutputStream out;
	ObjectOutputStream objout;
	
	WriteObjects(){
		try{
			out = new FileOutputStream("src/obj.txt");
			objout = new ObjectOutputStream(out);
			Book b1 = new Book(101, "Core Java", 12.34);
			objout.writeObject((b1));
			System.out.println("Book is stored");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				out.close();
				objout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
				}
		}
	}
	public static void main(String[] args) {
		new WriteObjects();

	}

}
