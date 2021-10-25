package com.sa.test;

public class Reverse {
	public static void main(String args[])
	{
	String name= "bangalore",rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
	char ch = name.charAt(i);
	rev+= Character.toString(ch);
	}
	System.out.println(rev);
	}
	}

