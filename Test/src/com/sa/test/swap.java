/**
 * 
 */
package com.sa.test;

/**
 * @author chaitra
 *
 */
public class swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
			String s1="hare";
		    String s2="rama";
		    System.out.println("before swapping");
			System.out.println("the value of s1 is:"+s1 );
			System.out.println("the value of s2 is :"+s2);
		    s1=s1+s2;
		    s2=s1.substring(0,s1.length()-s2.length());
		    s1=s1.substring(s2.length());
		    System.out.println("after swapping");
			System.out.println("the value of s1 is:"+s1 );
			System.out.println("the value of s2 is:"+s2);
	}
}
