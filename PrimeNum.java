/*
 *PrimeNum.java
 *Eric 
 *CSC 30
 *code stuff
 */

import java.util.Scanner;

public class PrimeNum
{
	public static void main(String[] args)
	{
		
		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\t**** PRIME NUMBER ****");
		
		System.out.print("\n\tEnter a number: ");
		number = input.nextInt();
		
		System.out.println("\n\tIs " + number + " prime? " + isPrime(number));
		
	}
	
	public static boolean isPrime(int number)
	{
		int divisor = 1;
		int result;
		boolean prime;
		
		do {
		divisor ++;
		result = number % divisor;
		} while (result != 0);
		
		if (divisor == number) {
		prime = true;
		} else {
		prime = false;
		}
		
		return(prime);
		
	}
	
}
