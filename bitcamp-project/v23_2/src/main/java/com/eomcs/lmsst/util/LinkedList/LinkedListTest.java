package com.eomcs.lmsst.util.LinkedList;

public class LinkedListTest {

	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("aaa");
		list.add("bbb");
		list.add("CCC");
		list.add("CCCdd");
		list.add("fff");	
		list.add("eee");
		list.add("ggg");
		
		print(list);
		
	}
	static void print(LinkedList list) {
		Object[] arr = list.toArray();
		for(Object i :arr) {
			System.out.println(i);
		}
	}
}
