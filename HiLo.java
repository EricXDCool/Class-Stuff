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
		
		System.out.println("\n\tHigh Low GAME ");
		
		System.out.println("\n\tRULES");
		System.out.println("\tNumbers 1 through 6 are low");
		System.out.println("\tNumbers 8 through 13 are high");
		System.out.println("\tNumber 7 is neither high or low");
		
		game(points);
		
	}

	public static int game(int points) {
		
		int risk;
		
		int guess;
		
		Random rand = new Random();
		
		int number = rand.nextInt(13) + 1;
		
		String again;
		
		String yes = "y";
		String no = "n";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\tYou have " + points + " points.");
		
		
		
		System.out.print("\n\tEnter points to risk: ");
		risk = input.nextInt();
		
		while (risk <= points) {
		
		System.out.print("\n\tPredict (1 = High, 0 = Low) :");
		guess = input.nextInt();
		
		System.out.println("\n\tThe Number is : " + number);
		
		if (guess == 1 && number >= 8) {
			
			System.out.println("\n\tYou Win!");	
			
			points = risk * 2 + points;
			
		} else if (guess == 1 && number <= 6) {
			
			System.out.println("\n\tYou Lose.");	
			
			points = points - risk;
			
		} else if (guess == 0 && number <= 6) {
			
			System.out.println("\n\tYou Win!");	
			
			points = risk * 2 + points;
			
		} else if (guess == 1 && number >= 8) {
			
			System.out.println("\n\tYou Lose.");	
			
			points = points - risk;
		} else { 
		
			System.out.println("\n\tYou Lose."); 
		
			points = points - risk;
		
		}
		
		if (points <= 0) {
		
			System.out.println("\n\tYou have no more points!");	
			
		}
		
		
		System.out.print("\n\tPlay Again? <y/n> : ");
		again = input.next();
		
		if (again.equals(yes)) {
		
			game(points);
			
		} else {
		
			
			endLoop(points);
		}
	
		
		} 
		
		System.out.println("\n\tNot valid amount");
		
		return(points);
	}

	public static void endLoop(int points){
	
	System.out.println("\n\tThanks for Playing!");
	
	
	}











	
}
