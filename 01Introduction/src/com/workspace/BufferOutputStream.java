package com.workspace;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStream {

	
	
	public static void main(String[] args) throws IOException {
		File file = new File("c:\\Naresh\\newoperation\\newfile.txt");
		file.createNewFile();
		Student student=new Student(0, null, null, 0);
		FileOutputStream fos= new FileOutputStream(file);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write(null);
	}
		
}
