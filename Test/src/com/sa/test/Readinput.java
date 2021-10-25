package com.sa.test;

import java.util.Scanner;

public class Readinput
	{
		public static void main(String[] args)
		{
			//java.util.Scanner sc=new java.util.Scanner(System.in);
			Scanner sc=new Scanner(System.in);
			System.out.println("Plz enter any value");
			int i=sc.nextInt();
			System.out.println("The Value entered is: " +i);
			
			System.out.println("Plz enter any String1");
			String s1=sc.next();
			
			System.out.println("Plz enter any String2");
			String s2=sc.nextLine();
			
			
			System.out.println("The String1 Value is: " +s1);
			System.out.println("The String2 Value is: " +s2);
		}
	}