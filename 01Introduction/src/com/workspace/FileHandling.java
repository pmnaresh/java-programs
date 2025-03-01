package com.workspace;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File file = new File("c:\\Naresh\\newoperation\\newfile.txt");
		FileOutputStream out = new FileOutputStream(file);
		String story ="hi how ARE YOU";
		byte[] storyInBytes=story.getBytes();
		out.write(storyInBytes);
		System.out.println("DONE");
		
}
}