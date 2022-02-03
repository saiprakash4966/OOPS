package com.bl;

public class StaticBlock 
{
	 static int num;
	   
	   static
	   {
	      num = 55;
	      
	   }
	   public static void main(String args[])
	   {
	      System.out.println("Value of num: "+num);
	     
	   }

}
