package com.marlabs.demo;

import java.io.File;

public class FileDemo  {
	File file;
	
	FileDemo(String ext){
		try{
			String path = "E:" ;
			file = new File(path);
			if(file.isDirectory()){
				System.out.println("Yes");
				String arr[] = file.list(new Extension(ext));
				for(int i = 0 ; i<arr.length ; i++)
				{	
					if(new File(path + "/ " + arr[i]).isDirectory())
					System.out.println(arr[i] + "Dir");
					else
					System.out.println(arr[i]  +"File");	
				}
			}
			else{
				System.out.println(file.isHidden() ? "Hidden" : "Visible");
				System.out.println(file.canWrite() ? "Writable" : "Read only");
				System.out.println(file.length());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new FileDemo(args[0]);

	}

}
