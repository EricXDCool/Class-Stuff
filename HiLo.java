/*
 *HiLo.java
 *CSC 30
 *Eric
 *June 1, 2017
 *
 */
 
import java.util.Scanner;
import java.util.Random;
 
public class HiLo
{
	public static void main(String[] args)
	{
		
		int points = 1000;
		
		Random rand = new Random();
		
		int number = rand.nextInt(13) + 1;
		
		System.out.println("\n\tHigh Low GAME ");
		
		System.out.println("\n\tRULES");
		System.out.println("\tNumbers 1 through 6 are low");
		System.out.println("\tNumbers 8 through 13 are high");
		System.out.println("\tNumber 7 is neither high or low");
		
		System.out.println("\n\tYou have " + points + " points.");
		
	}

	public static int game(int points) {
		
		int guess;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\tEnter points to risk: ");
		guess = input.nextInt();
		
		
		
	}













	
}
