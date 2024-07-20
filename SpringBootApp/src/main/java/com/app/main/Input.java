package com.app.main;

import java.util.Scanner;

public class Input 
	  {
    public static void main(String[]args)
    {
     
      Input inp = new Input ();
      inp.SumCubes();
    }
    public void SumCubes()
    {
    	 Scanner scan = new Scanner(System.in);
      System.out.println("Enter num 1:");
    
	int num1 = scan.nextInt();
      System.out.println("Enter num 2:");
      int num2 = scan.nextInt();
       System.out.println("Enter num 3:");
      int num3 = scan.nextInt();
      int sum = (num1 * num1 * num1) +
                (num2 * num2 * num2) + 
                (num3 * num3 * num3);
           System.out.println("the three number are :" + num1+"," + num2 +"," + num3 +",");
           System.out.println("the sum of cubes is :" + sum);
    }
    }



