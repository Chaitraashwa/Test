/**
 * 
 */
package com.sa.test;

/**
 * @author chaitra
 *
 */
public class palindrome2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer(args[0]);
		StringBuffer s2=new StringBuffer(s1);
		s1.reverse();
		System.out.println("Given String is:"+s2);
		System.out.println("Reverse String is:"+s1);
		if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)
		System.out.println("Given string is Palindrome");
		else
		System.out.println("Given string is not a palindrome");
		}
		}