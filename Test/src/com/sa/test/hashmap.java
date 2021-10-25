/**
 * 
 */
package com.sa.test;

import java.util.HashMap;

/**
 * @author chaitra
 *
 */
public class hashmap {

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

	}
				}}}
