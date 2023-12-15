package com.codinghub;
import java.util.Scanner;
public class aditya 
{
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			int total=0,quantity=0;
			String decision;
			int Samsung=20000,iphone=100000,vivo=11000,oneplus=50000;
			System.out.print("HELLO WELCOME TO A MOBILE STORE");
			while(true)
			{
				System.out.println("CHOOSE MOBILES");
				System.out.println("SAMSUNG\t iphone\t vivo\t oneplus\t");
				String mobile=s.next();
				if(mobile.equals("Samsung"))
				{
					System.out.println("HOW MANY DO YOU WANT");
					quantity=s.nextInt();
					if(quantity>5)
					{
						System.out.println("SORRY NOT AVAILABLE");
					}
					else
					{
						int  price=quantity*Samsung;
						total=total+price;
					}
				}
				else if(mobile.equals("iphone"))
				{
					System.out.println("HOW MANY DO YOU WANT");
					quantity=s.nextInt();
					if(quantity>5)
					{
						System.out.println("SORRY NOT AVAILABLE");
					}
					else
					{
						int  price=quantity*iphone;
						total=total+price;
					}
				}
				else if(mobile.equals("vivo"))
				{
					System.out.println("HOW MANY DO YOU WANT");
					quantity=s.nextInt();
					if(quantity>5)
					{
						System.out.println("SORRY NOT AVAILABLE");
					}
					else
					{
						int  price=quantity*vivo;
						total=total+price;
					}
				}
				else if(mobile.equals("oneplus"))
				{
					System.out.println("HOW MANY DO YOU WANT");
					quantity=s.nextInt();
					if(quantity>5)
					{
						System.out.println("SORRY NOT AVAILABLE");
					}
					else
					{
						int  price=quantity*oneplus;
						total=total+price;
					}
				}
				else
				{
					System.out.print(" SORRY OUT OF STACK");
				}
				
				System.out.print("DO YOU WANT TO CONTINUE");
				decision=s.next();
				if(decision.equals("no"))
				{
					System.out.print("YOUR TOTAL BILL"+total);
					break;
				}
				
				
			}
			
		}
		
	}



