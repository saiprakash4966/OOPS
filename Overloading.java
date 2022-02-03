package com.bl;

public class Overloading 
{
	  
		static int add(int x,int y)
		{
			return x+y;
		}
		
		static int add(int x,int y,int z)
		{
		return x+y+z;
		}
	}


	 class Test
      {
		public static void main(String[] args)
		{  
			System.out.println(Overloading.add(5, 9));
		}
	}
	
		
