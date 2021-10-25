package com.sa.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		ll.add("3");
		ll.add("Rajesh");
		ll.add("Java");
		ll.add("PHP");
		ll.add("Rajesh");
		ll.add(null);
	
		System.out.println(ll);
		ll.addFirst("First Object");
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
		Collections.shuffle(ll);
	    System.out.println(ll);
	    List synList=Collections.synchronizedList(ll);
	}
	

}
