package com.codinghub;

import java.util.Scanner;

public class library 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int total=0,days=0;
		String decision;
		int data_structures=5,mech=10,eco=20,quizz=15;
		System.out.println("HELLO WELCOME TO A LIBRARY APPLICATION");
		while(true)
		{

			System.out.println("CHOOSE A BOOK");
			System.out.println("Data_structures\t Mech\t Eco\t Quizz");
			String book=s.next();

	    if(book.equals("Data_structures"))
	     {
		  System.out.println("HOW MANY DAYS DO YOU WANT");
		  days=s.nextInt();
			if(days>5&&days<=10)
			{
				int  price=(days-5)*(data_structures);
				total=total+price;
			}
			else if(days>10)
			{
				int  price=(days-10)*(data_structures+50);
				total=total+price;
			}
			else
			{
				System.out.println("NO FINE");
			}
			
	     }
	    else if(book.equals("Mech"))
	     {
		  System.out.println("HOW MANY DAYS DO YOU WANT");
		  days=s.nextInt();
			if(days>5&&days<=10)
			{
				int  price=(days-5)*(mech);
				total=total+price;
			}
			else if(days>10)
			{
				int  price=(days-10)*(mech+50);
				total=total+price;
			}
			else
			{
				System.out.println("NO FINE");
			}
	     } 
	    else if(book.equals("Eco"))
	     {
		  System.out.println("HOW MANY DAYS DO YOU WANT");
		  days=s.nextInt();
			if(days>5&&days<=10)
			{
				int  price=(days-5)*(eco);
				total=total+price;
			}
			else if(days>10)
			{
				int  price=(days-10)*(eco+50);
				total=total+price;
			}
			else
			{
				System.out.println("NO FINE");
			}
	     } 
	    
	    else if(book.equals("Quizz"))
	     {
	    	System.out.println("HOW MANY DAYS DO YOU WANT");
			days=s.nextInt();
			if(days>5&&days<=10)
			{
				int  price=(days-5)*(quizz);
				total=total+price;
			}
			else if(days>10)
			{
				int  price=(days-10)*(quizz+50);
				total=total+price;
			}
			else
			{
				System.out.println("NO FINE");
			}
	     } 
	    else
	     {
		  System.out.println("SORRY OUT OF STOCK");
	     }

	    System.out.print("DO YOU WANT TO CONTINUE");
		decision=s.next();
		if(decision.equals("no"))
		{
			System.out.println("YOUR TOTAL DUE FINE:"+total);
			System.out.println("THANK YOU VISIT AGAIN!!!!!");
			break;
		}
		
	  }
	}
}
