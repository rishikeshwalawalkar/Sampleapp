package com.exception;

import java.util.ArrayList;

public class Product_Service {
	ArrayList<String> products;
	public Product_Service() {
		products = new ArrayList<String>();
		products.add("Samsung");
		products.add("LG");
	}
	
	public void checkOut(String product) throws Custom_Exception{
		if(!products.contains(product)){
			throw new Custom_Exception();
		}
	
	}
	
	public static void main(String[] args)
	{
		
		Product_Service ps = new Product_Service();
		try{
		ps.checkOut("htc");}
		catch (Custom_Exception e)
		{System.out.println(e);}
	}

}
