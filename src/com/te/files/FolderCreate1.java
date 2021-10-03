package com.te.files;

import java.io.File;

public class FolderCreate1 {
	
	public void folderCreate(String str) {
		
        File f1 = new File(str);
		
		boolean b = f1.exists();
		
		if (b == false) {
			boolean folder = f1.mkdir();
			System.out.println("folders successfuly created");
		} else {
			System.out.println("folder already exists");
		}
		
		
	}

}
