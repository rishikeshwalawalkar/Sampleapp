package com.marlabs.demo;

import java.io.File;
import java.io.FilenameFilter;

public class Extension implements FilenameFilter{
	String ext;
	public Extension(String ext){
		this.ext = ext;
		
	}
	
	public boolean accept(File file, String name){
		return name.endsWith(ext);
	}
}
