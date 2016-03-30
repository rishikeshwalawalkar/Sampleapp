package com.marlabs.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadStringFile {
	
	BufferedReader br;
	FileReader fr;
	FileWriter fw;
	String str;
	ReadStringFile(){
		try{
			fr = new FileReader("src/data.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("src/temp2.txt");
			while((str = br.readLine()) != null){
					fw.write(str + "\n");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				fw.close();
				br.close();
				fr.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new ReadStringFile();

	}

}
