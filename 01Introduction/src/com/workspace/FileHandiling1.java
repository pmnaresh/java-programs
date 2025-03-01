package com.workspace;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandiling1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter file name : ");
		Scanner sc = new Scanner(System.in);
		String filename= sc.nextLine();
		
		
		File file = new File("c:\\Naresh\\newoperation\\ "+ filename + ".txt");
		System.out.println(file.createNewFile());
		System.out.println("file name is  exist  " +file.exists());
		System.out.println("please find the file in the given path " +file.getCanonicalPath());
		System.out.println("A file "+ filename +" is created please write a story");
		String Story= sc.nextLine();
		
		FileOutputStream out = new FileOutputStream(file,true);
//		byte[] storyInBytes=Story.getBytes();
		out.write(Story.getBytes());
		System.out.println("Story successfully added into the "+filename);
		
	}
	

}
