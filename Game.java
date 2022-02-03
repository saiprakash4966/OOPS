package com.bl;

public class Game
{
	 public void displayInfo() {
	      System.out.println("Game");
	   }
	}

	class Cricket extends Game 
	{
	   @Override
	   public void displayInfo() 
	   {
	      System.out.println("My favourite game is cricket");
	   }
	}

	class Play
	{
	   public static void main(String[] args)
	   {
	      Cricket c1 = new Cricket();
	      c1.displayInfo();
	   }

}
