/**
 * 
 */
package com.sa.test;

/**
 * @author chaitra
 *
 */
public class palindrome1 {

	/**
	 * @param args
	 */
			public static void main(String[] args) {
				 String s1 = new String("madam");
				 String s2=  new String("malayalam");
		         String s3=  new String("bangalore");
		         String rev = "";
		         for(int i=s1.length()-1;i>=0;i--)
	             	{
	             	char ch = s1.charAt(i);
	             	rev+= Character.toString(ch);
	             	}
	             	System.out.println(rev);   
	  
	             	for(int i=s2.length()-1;i>=0;i--)
	             	{
	             	char ch = s2.charAt(i);
	             	rev+= Character.toString(ch);
	             	}
	             	System.out.println(rev);
	             	
	             	for(int i=s3.length()-1;i>=0;i--)
	             	{
	             	char ch = s1.charAt(i);
	             	rev+= Character.toString(ch);
	             	}
	             	System.out.println(rev);
				 //s1=s2=true;s2=s1=true;s2=s3=false;s3=s1=false;
		                 System.out.println(s1);//true
		                 System.out.println(s2);//true
		                 System.out.println(s3);//false
				         System.out.println(s1.equals(s2));//true
		                 System.out.println(s2.equals(s1));//true
		                 System.out.println(s2.equals(s3));//f
		                 System.out.println(s3.equals(s1));//f          
				 System.out.println(s1.equalsIgnoreCase(s2));//true
		         System.out.println(s1.equalsIgnoreCase(s2));//true
		         System.out.println(s1.equalsIgnoreCase(s3));//f
		         System.out.println(s3.equalsIgnoreCase(s2));//f
                 System.out.println(s1.hashCode()==s2.hashCode());  //true
				 System.out.println(s1.hashCode()+" "+s2.hashCode()); //	 
				 System.out.println(s2.hashCode()==s1.hashCode());  //true
				 System.out.println(s2.hashCode()+" "+s1.hashCode()); //
				 System.out.println(s3.hashCode()==s1.hashCode());  //f
				 System.out.println(s3.hashCode()+" "+s1.hashCode()); //
				 System.out.println(s3.hashCode()==s2.hashCode());  //f
				 System.out.println(s3.hashCode()+" "+s2.hashCode()); //
		                  System.out.println(s1);
		                  System.out.println(s2);
		                  System.out.println(s3);

	}

}

