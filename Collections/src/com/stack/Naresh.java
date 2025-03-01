package com.stack;

import java.util.Stack;

public class Naresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(new String ("Naaaaresh"));
		stack.push(new String ("kajal"));
		stack.push(new Integer(458525));
		stack.add(new Long(1546532));
		stack.add(3,new Double (5562114.2545d));
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);

	}

}
