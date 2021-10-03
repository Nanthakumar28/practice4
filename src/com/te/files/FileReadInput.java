package com.te.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileReadInput {

	public static void main(String[] args)  {
		String s1 = "xdfghuiol";

		String str = "C:\\Users\\Lenovo\\Desktop\\Test1.txt";
		
		try {
			FileWriter fw = new FileWriter(str);
			fw.write(s1);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");
	}

}
