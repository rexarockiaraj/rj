package org.gov;

import java.util.Scanner;

public class Vote {
	
		public static void main(String[] args)
	    {
	        
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter Your Age : ");
	        int a = s.nextInt();
	        if (a >= 18)
	        {
	            System.out.println("You are eligible for vote.");
	        }
	        else
	        {
	            System.out.println("You are not eligible for vote.");
	        }
	       
	    }
}
