
//DisplayBox.java

import java.util.Scanner;

public class DisplayBox2
{
	public static void main(String[] args)
	{
		
		int width, height;
		
		Scanner input = new Scanner(System.in);
		
		String mark;
		String choice;
		
		System.out.println("\n\t**** DISPLAY BOX ****");
		
		System.out.print("\n\tEnter the width: ");
		width = input.nextInt();
		
		System.out.print("\n\tEnter the height: ");
		height = input.nextInt();
		
		System.out.print("\n\tWould you like to use a custom Symbol? (y or n)");
		choice = input.next();
		
		if (choice.equalsIgnoreCase("y") == true) {
		
			System.out.println("\n\tWhat symbol would you like to use? ");
			mark = input.next();
			
			drawBox(width, height, mark);
			
		} else {
			
			
			drawBox(width, height);
		
		}
		
		
		
	}
	
	public static void drawBar(int width) {

		for (int i = 1; i <= width; i++) {
		System.out.print("* ");
		}
		
		System.out.println();
	}
	
	public static void drawBar(int width, String mark) {
	
		for (int i = 1; i <= width; i++) {
		System.out.print(mark);
		}
		
		System.out.println();
	
	}
	
	public static void drawBox(int width, int height) {
		
		for (int i = 1; i <= height; i++){
		
			drawBar(width);
		}
			
		
	}
	
	public static void drawBox(int width, int height, String mark) {
		
		for (int i = 1; i <= height; i++){
		
			
			drawBar(width, mark);
		
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
