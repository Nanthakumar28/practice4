package com.te.files;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public void fileCreate(String str) {

		File f1 = new File(str);

		boolean b = f1.exists();

		if (b == false) {
			try {
				boolean create = f1.createNewFile();
				System.out.println("file sucessfully created");
			} catch (IOException e) {
				System.out.println("file not created");
			}
        }
	}
}
