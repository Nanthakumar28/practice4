package com.te.files1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("C:\\Users\\Lenovo\\Desktop\\Test1.txt");
			int a = fr.read();
			
			while (a != -1) {
				System.out.print((char)a);
				a = fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

		
		
		
		
	}
}
