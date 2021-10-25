/**
 * 
 */
package com.sa.test;

import java.util.HashMap;
import java.lang.*;

/**
 * @author chaitra
 *
 */
public class map {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		String s="Bangalore";
				for(int i=0;i<s.length();i++)
				{
					char c=s.charAt(i);
					Number value=(Number) hm.get(c);
					if(value!=null)
					{
					hm.put(c,1);
					System.out.println(hm.get(c));

	}
				}}}
