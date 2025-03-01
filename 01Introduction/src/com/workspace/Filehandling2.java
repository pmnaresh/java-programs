package com.workspace;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		File file = new File ("c:\\Naresh\\newoperation\\"+name+".txt");
		System.out.println(file.createNewFile());
		System.out.println(file.getAbsolutePath());	
		
		System.out.println(file.canExecute());
		System.out.println(file.compareTo(file));
		System.out.println(file.getAbsolutePath());
		
	}

}
