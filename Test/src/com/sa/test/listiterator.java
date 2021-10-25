/**
 * 
 */
package com.sa.test;

import java.util.Collections;
import java.util.List;

/**
 * @author chaitra
 *
 */
public class listiterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listiterator linkedlist = new listiterator();
		linkedlist.add("java");
		linkedlist.add("abc");
		linkedlist.add("jj");
		linkedlist.add("yyy");
		System.out.println(linkedlist);
		Collections.reverse((List<?>) linkedlist);
		System.out.println(linkedlist);
}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}}

	