/**
 * 
 */
package com.sa.test;

/**
 * @author chaitra
 *
 */
public class exception {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("child exp");
		}
		catch(Exception e)
		{
			System.out.println("parent exp");
		}
	}
}
