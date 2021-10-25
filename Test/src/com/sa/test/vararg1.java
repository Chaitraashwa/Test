/**
 * 
 */
package com.sa.test;

/**
 * @author chaitra
 *
 */
public class vararg1 {
public static void sum(int...x)
{
int total=0;
for(int i=0;i<x.length;i++)
{
	total=total+x[i];
}
System.out.println("the sum is:"+total);
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum();
sum(10);
sum(10,20);
sum(10,20,30);
sum(10,20,30,40);
	}
}
