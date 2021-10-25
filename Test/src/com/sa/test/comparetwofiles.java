package com.sa.test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author chaitra
 *
 */
public class comparetwofiles {

	private static final String S = null;
	private static String line1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br1=new BufferedReader(new FileReader("D:\\xyz.txt"));
		String line1=null;
		while((line1=br1.readLine())!=null)
		{
			System.out.println(line1);
		}
		}
	BufferedReader br2=new BufferedReader(new FileReader("D:\\acz.txt"));
	String line2=null;
	private Object hm;
	while((line2=br2.readLine())!=null)
	{
		System.out.println(line2);
{
String Str;
int i;
if(((Object) hm).get(S)==null)
hm.put(Str.charAt(i),1);
else
{
	int line=((Object) hm).get(S);
	line++;
	((Object) hm).put(S,line);
}}

}
	reader.close();
		