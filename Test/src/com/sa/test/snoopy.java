/**
 * 
 */
package com.sa.test;

/**
 * @author chaitra
 *
 */
public class snoopy {
	private int age;
	String name;
	String colour;
	/**
	 * @param args
	 */
	public void setage(int a)
	{
		// TODO Auto-generated method stub
if(a<0)
{
	System.out.println("age not valid");
}
	else age=a;
}
	public int getage()
	{
		return age;
	}
void bark()
{
	System.out.println("bow bow bowwww");
}
void eat()
{
	System.out.println("chickennn");
}
void display()
{
	System.out.println ( "snoopypet name is :"+name);
System.out.println("colour is :"+colour);}
}
