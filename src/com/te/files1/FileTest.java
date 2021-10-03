package com.te.files1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class FileTest {
	
	public void filestream(String str) {
		
		try {
			FileInputStream fis = new FileInputStream(str);
			ObjectInputStream in = new ObjectInputStream(fis);
			Object ob =in.readObject();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
