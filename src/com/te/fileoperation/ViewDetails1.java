package com.te.fileoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ViewDetails1 {
	
	public void views(String file) {
		
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object ob = ois.readObject();
			AdharDetails ad1 = (AdharDetails) ob;
			System.out.println("object created");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
