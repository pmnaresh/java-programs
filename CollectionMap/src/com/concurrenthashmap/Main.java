package com.concurrenthashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

	public static void main(String[] args) {
		ConcurrentHashMap chm = new ConcurrentHashMap<Integer, String>();
		chm.put(100,"Naresh");
		chm.put(102, "kumar");
		chm.put(105, "I love you");
		chm.put(108, "LOVE");
		
		Iterator itr = chm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = 	(Entry<Integer, String>) itr.next();
			System.out.println(entry);
			chm.remove(102);   // it wont return concurrent exception it deletes the object
		}
		
	}

}
