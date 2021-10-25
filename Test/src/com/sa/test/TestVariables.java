package com.sa.test;
public class TestVariables
{   int age;
	static String univercity;
	public static void main(String [] args)
	{
		TestVariables t1= new TestVariables();
		TestVariables t2= new TestVariables();
		int i;
		t1.age=20;
		t2.age=10;
		t1.univercity="BU";
		t2.univercity="VTU";
		if(args.length>0)
		{
			i=10;
		}
		else
		{
			i=0;
		}
		System.out.println("Local Variable: "+i);
		System.out.println("Instance Variable: "+t1.age);
		System.out.println("Instance Variable_2: "+t2.age);
		System.out.println("Instance Variable: "+t1.univercity);  //VTU
		System.out.println("Instance Variable: "+t2.univercity);  //VTU		
	}
	
}