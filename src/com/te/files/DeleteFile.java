package com.te.files;

import java.io.File;

public class DeleteFile {
	
	public static void main(String[] args) {
		String str = "C:\\Users\\Lenovo\\Desktop\\kgf.mp4";
        
		DeleteFile1 df = new DeleteFile1();
		df.delete(str);
	}

}
