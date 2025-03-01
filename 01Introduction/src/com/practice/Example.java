package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {

		Functional ex=(a,b)->(a+b);
		System.out.println(ex.add(100, 200));
		
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		
		arrayList.add(12);
		arrayList.add(new Integer(34));
		arrayList.add(2);
		arrayList.add(18);
		
		arrayList.forEach((number)-> System.out.println(number));
		
		
		Functional1 f1 =(name)->{ 
		return "Hello " +name;};
		
		System.out.println(f1.naresh("Naresh"));
		
		
		ArrayList<Product> pList=new ArrayList<Product>();
		pList.add(new Product(1,"HP" ,45000));
		pList.add(new Product(2,"Dell" ,12000));
		
		pList.add(new Product(3,"MAC" ,34000));
		pList.add(new Product(4,"Lenovo" ,8000));
		pList.add(new Product(5,"HP1" ,5000));
		pList.add(new Product(6,"Dell1" ,120000));
		
		pList.add(new Product(7,"MAC1" ,340000));
		pList.add(new Product(8,"Lenovo1" ,8000));
		
		Optional<Product> number=pList.stream().filter(p->(p.getpPrice()>8000)).findFirst();
		System.out.println(number);
		Optional<Product> number1=pList.stream().filter(p->(p.getpPrice()>8000)).findAny();
		System.out.println(number1);
		
//		List<Integer> productPriceList2 
		Stream<Integer> number4=pList.stream().filter(p -> p.getpPrice() > 30000)
				.map(p->p.getpPrice()).skip(1);
				//.collect(Collectors.toList());
		System.out.println("****"+number4.toString());
		
		
		pList.stream().filter(p->p.getpPrice()==8000).forEach(System.out::println);
		
		pList.stream().filter(p->p.getpPrice()==8000).forEach(p->System.out.println(p.getpName()));
		
		
		List<String> a = Arrays.asList("Naresh","123","1233");
		
		Stream.generate(new Random()::nextInt)  
		.limit(6).forEach(System.out::println); 
				
	}}
