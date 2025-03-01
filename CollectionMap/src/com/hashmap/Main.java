package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "Naresh");
		map.put(2,"kumar");
		map.put(3, "Suresh");
		
		map.put(5,"Ram");
		map.put(4,"Naresh");
		System.out.println(map.size());
		map.put(null,"Raju");
		map.put(null, "bheem");
		System.out.println(map.size());
		map.put(123,null);
		map.put(152, null);
		System.out.println(map.size());
		
		for(Object obj : map.entrySet()) {
			System.out.println(obj);
			
		}
		HashMap<Integer,String> hash = new HashMap();
		hash.put(101,"Naresh");
		hash.put(102,"Kumar");
		hash.put(103, "Suresh");
		hash.put(104, "raju");
		hash.put(105, "Bhemm");
		hash.put(106, "jhenny");
		System.out.println("***************");
//		Set entryset=hash.entrySet();
//		Iterator itr = entryset.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		System.out.println("***********");
		Set<Integer> keys= hash.keySet();
//		Iterator itr1= keys.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
		for(Integer key:keys) {
			System.out.println(hash.get(key));
		}
		
		
		System.out.println("************");
		Collection coll=hash.values()	;
		Iterator itr2=coll.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
