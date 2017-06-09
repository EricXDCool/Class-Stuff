
//Conversion.java

import java.util.Scanner;

public class Conversion
{
	public static void main(String[] args)
	{
		
		double num;
		int chose;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\t**** METRIC CONVERSION ****");
		
		System.out.print("\n\tEnter a Number: ");
		num = input.nextDouble();
		
		System.out.println("\n\tConvert:");
		System.out.println("\t1. Inches to Centimeters");
		System.out.println("\t2. Feet to Centimeters");
		System.out.println("\t3. Yards and Meters");
		System.out.println("\t4. Miles to Kilometers");
		
		System.out.print("\n\tEnter your choice: ");
		chose = input.nextInt();
		
		if (chose == 1) {
		inchToCenti(num);
		} else if (chose == 2) {
		feetToCenti(num);
		} else if (chose == 3) {
		yardToMeter(num);
		} else if (chose == 4) {
		mileToKilom(num);
		}
		
		
	
	}
	
	
	public static void inchToCenti(double num) {
		
		double cent;
		
		cent = num * 2.45;
		
		System.out.println("\n\t" + num + " Inches is equal to " + cent + " Centimeters");
		
	}
	
	public static void feetToCenti(double num) {
		
		double cent;
		
		cent = num * 30;
		
		System.out.println("\n\t" + num + " Feet is equal to " + cent + " Centimeters");
	}
	
	public static void yardToMeter(double num) {
		
		double meter;
		
		meter = num * 0.91;
		
		System.out.println("\n\t" + num + " Yards is equal to " + meter + " Meters");
		
		
	}
	
	public static void mileToKilom(double num) {
		
		double kilo;
		
		kilo = num * 1.6;
		
		System.out.println("\n\t" + num + " Miles is equal to " + kilo + " Kilometers");
		
	}
	
	
	
	
	
	
	
	
}


