/*
 *TimeConvert.java
 *Eric
 *CSC30
 *convert time amounts to other time amounts
 *
 */

import java.util.Scanner;

/**
 *Convert time as we know it
 */
 
public class TimeConvert
{

	public static void main(String[] args)
	{
	
		//variable stuff
		int choice;
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//header
		System.out.println("\n\t****TIME CONVERTER****");
		
		//option
		System.out.println("\n\t1. Hours to Minutes");
		System.out.println("\t2. Days to Hours");
		System.out.println("\t3. Minutes to Hours");
		System.out.println("\t4. Hours to Days");
		
		System.out.print("\n\tPlease enter a Number for your choice of conversion (1 to 4): ");
		choice = input.nextInt();
		
		//if stuff
		if (choice == 1) {
		hoursToMinutes();
		} else if (choice == 2) {
		daysToHours();
		} else if (choice == 3) {
		minutesToHours(); 
		} else {
		hoursToDays(); 
		}
				
	}
	
	
	public static void hoursToMinutes()
	{
	
		//variables
		int hours, minutes;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\tEner the amount of hours: ");
		hours = input.nextInt();
		
		//convert
		
		minutes = hours * 60;
		
		System.out.println("\n\tThere is " + minutes + " minutes in " + hours + " hour(s).\n");
		
		System.out.println();
		
	}
	
	public static void daysToHours()
	{
	
		//variables
		double days, hours;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\tEner the amount of days: ");
		days = input.nextDouble();
		
		//convert
		
		hours = days * 24;
		
		System.out.println("\n\tThere is " + hours + " hours in (a)" + days + " day(s).\n");
		
		System.out.println();
		
	}
	
	public static void minutesToHours()
	{
	
		//variables
		double hours, minutes;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\tEner the amount of minutes: ");
		minutes = input.nextDouble();
		
		//convert
		
		hours = minutes / 60;
		
		System.out.println("\n\tThere is " + hours + " hours in " + minutes + " minute(s).\n");
		
		System.out.println();
		
	}
	
	public static void hoursToDays()
	{
	
		//variables
		double hours, days;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\tEner the amount of hours: ");
		hours = input.nextDouble();
		
		//convert
		
		days = hours / 24;
		
		System.out.println("\n\tThere is " + hours + " hours in " + days + " day(s).\n");
		
		System.out.println();
		
	}
	
}
