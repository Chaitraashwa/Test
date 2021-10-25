/**
 * 
 */
package com.sa.test;

/**
 * @author chaitra
 *
 */
public class swaptwonumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=20;
		System.out.println("before swapping");
		System.out.println("the value of i is:"+i );
		System.out.println("the value of j is :"+j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("after swapping");
		System.out.println("the value of i is:"+i );
		System.out.println("the value of j is:"+j);
	}}
