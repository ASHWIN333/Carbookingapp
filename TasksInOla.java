package com.chainsys;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.*;

public class TasksInOla {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("LOGIN");
		String password=sc.next();
		String mobile=sc.next();
		if (password.length()>=8 && mobile.length()==10) {
			System.out.println("Submit");
		}
		
		else if(password.length()<8 && mobile.length()==10){
				System.out.println("Invalid password");
		}
		else {
			System.out.println("Invalid mobile number");
		}
		//LEVEL 2
		
		System.out.println("CAB TYPES");
		System.out.println("1.Micro");
		System.out.println("2.Mini");
		System.out.println("3.Prime");
		
		//LEVEL 3
		System.out.println("PRICE ESTIMATOR");
		Scanner a=new Scanner(System.in);
		String cabvalue=a.next();
		int kms=a.nextInt();
		
		if (cabvalue.equals ("Micro")) {
			int price=kms*10;
			
			System.out.println("Your total bill amount is:" +price);
			
		}
		else if(cabvalue.equals("Mini")) {
			int price1=kms*15;
			
			System.out.println("Your total bill amount is:" +price1);
		}
		else if(cabvalue.equals("Prime")) {
			int price2=kms*20;
			System.out.println("Your total bill amount is:" +price2);
		}
		else {
			System.out.println("Invalid car choosen");
		}
		//LEVEL 4
		if (cabvalue.equals ("Micro")) {
			int price=kms*10;
			double gst=price*0.07;
			
			System.out.println("Your total bill amount after gst is:" +(price+gst));
			
		}
		else if(cabvalue.equals("Mini")) {
			int price1=kms*15;
			double gst=price1*0.07;
			
			System.out.println("Your total bill amount after gst is:" +(price1+gst));
		}
		else if(cabvalue.equals("Prime")) {
			int price2=kms*20;
			double gst=price2*0.07;
			System.out.println("Your total bill amount after gst is:" +(price2+gst));
		}
		else {
			System.out.println("Invalid car choosen");
		}
		//LEVEL 5
		System.out.println("Booking");
		System.out.println("Choose car type");
		Scanner ab=new Scanner(System.in);
		String cabvalues=ab.next();
		
		System.out.println("Enter Journey date");
		LocalDate now=LocalDate.now();
		System.out.println(now);
		System.out.println("Enter pickup time");
		Scanner abc=new Scanner(System.in);
		String time=abc.next();
		LocalTime cabPickupTime=LocalTime.parse(time);
		System.out.println(cabPickupTime);
		System.out.println("Submit");
		
		
		//Level 6
		
		int hour=cabPickupTime.getHour();
		//System.out.println("hour:"+hour);
		if(hour>=16 && hour<=18 ) {
			System.out.println("Peak hours");
			
		}
		if (cabvalue.equals ("Micro")) {
			double price=(kms*1.25)*10;
			double gst=price*0.07;
			
			System.out.println("Your total bill amount after gst is:" +(price+gst));
			
		}
		else if(cabvalue.equals("Mini")) {
			double price1=(kms*1.25)*15;
			double gst=price1*0.07;
			
			System.out.println("Your total bill amount after gst is:" +(price1+gst));
		}
		else if(cabvalue.equals("Prime")) {
			double price2=(kms*1.25)*20;
			double gst=price2*0.07;
			System.out.println("Your total bill amount after gst is:" +(price2+gst));
		}
		else {
			System.out.println("Invalid car choosen");
		}
		
		//Level 7
		System.out.println("Senior citizen");
		Scanner abcd=new Scanner(System.in);
		int agee=abcd.nextInt();
		if (cabvalue.equals ("Micro")&& agee>=60) {
				int price=kms*10;
				double gst=price*0.07;
				
				System.out.println("Your total bill amount after 50% discount is:" +(price+gst)/2);
				
			}
			else if(cabvalue.equals("Mini")&& agee>=60) {
				int price1=kms*15;
				double gst=price1*0.07;
				
				System.out.println("Your total bill amount after 50% discount is:" +(price1+gst)/2);
			}
			else if(cabvalue.equals("Prime")&& agee>=60) {
				int price2=kms*20;
				double gst=price2*0.07;
				System.out.println("Your total bill amount after 50% discount is:" +(price2+gst)/2);
			}
			else {
				System.out.println("Invalid car choosen");
			}
	}
}
