package com.marlabs.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputFile {

	FileInputStream in;
	FileOutputStream out;
	int i;
	InputFile(){
		try{
			in = new FileInputStream("src/data.txt");
			out = new FileOutputStream("src/temp.txt");
			while((i = in.read()) != -1){
			//System.out.print((char)i);
			out.write(i);
			}
		}catch(IOException ie){
			ie.printStackTrace();
		}
		finally{
			try{
				in.close();
				out.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new InputFile();
		
	}

}
