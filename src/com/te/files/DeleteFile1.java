package com.te.files;

import java.io.File;

public class DeleteFile1 {
	
	public void delete(String str) {
        
		File f1 =new File(str);
		
		boolean b = f1.exists();
		
		if (b == true) {
			boolean delete = f1.delete();
			System.out.println("succesfully deleted");
		} else {
			System.out.println("not file found");
		}
		
	}

}
