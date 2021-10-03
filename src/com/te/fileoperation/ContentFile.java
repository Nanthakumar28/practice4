package com.te.fileoperation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ContentFile {
	
	public static void main(String[] args) {
		
		AdharDetails ad = new AdharDetails("dhoni", 214544754, "Ranch");
		
	    try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Test1.txt");
			ObjectOutputStream oostream = new ObjectOutputStream(fout);
			oostream.writeObject(ad);
			System.out.println("object created");
			System.out.println(ad.name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	}

}
