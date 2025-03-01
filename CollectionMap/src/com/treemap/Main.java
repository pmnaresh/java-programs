package com.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<Integer, Student> tree= new TreeMap<Integer, Student>();// it will the objects in ascending Order .
		
		tree.put(new Integer(8), new Student(108,"Naresh","Sankara","Angallu","5485458"));
		tree.put(new Integer(1005), new Student(108,"Priya","Sankara","Angallu","5485458"));
		tree.put(new Integer(2), new Student(115,"chinni","Sankara","Angallu","5485458"));
		tree.put(new Integer(5), new Student(138,"Tippu","Sankara","Angallu","5485458"));
		tree.put(new Integer(800), new Student(108,"Naresh","Sankara","Angallu","5485458"));
		tree.put(new Integer(1), new Student(109, "Naveen", "Ramana", "vayalpad", "5445455"));
		
		
		Set entry = tree.entrySet();
		
		Iterator itr = entry.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Student> entryset=  (Entry<Integer, Student>) itr.next();
			System.out.println(entryset);
		}
		

	}

}
