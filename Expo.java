
//Expo.java

import java.util.Scanner;

import java.lang.Math;

public class Expo
{
	public static void main(String[] args)
	{
		
		int base, power;
		
		double answer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\t**** Expoential ****");
		
		System.out.print("\n\tEnter the base value: ");
		base = input.nextInt();
		
		System.out.print("\n\tEnter the power value: ");
		power = input.nextInt();
		
		
		
		System.out.println("\n\t The answer is " + powerOf(base, power) +"\n\n");
		
	}
	
	public static double powerOf(int base, int power)
	{
		
		double result;
		
		result = Math.pow(base,power);
		
		return (result);
		
		
		
	}
	
	

}
