package com.bl;

public class Overriding
{
	 
		  void run()
		  {
			  System.out.println("Vehicle is running");
		  }  
		}  
		 
		class Bike extends Overriding
		{  
		  public static void main(String args[])
		  {  
		    
		  Bike obj = new Bike();  
		    
		  obj.run();  
		  }  
		}  

