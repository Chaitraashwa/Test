package com.sa.test;

public class vararg {
	public static void methodone(int...x)
	{
		System.out.println("variable argument method");
	}
	public static void main(String[] args) 
	{
		methodone();
		methodone(10);
		methodone(10,20);
		methodone(10,20,30);
	}
	}
