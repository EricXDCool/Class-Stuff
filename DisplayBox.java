
//DisplayBox.java

import java.util.Scanner;

public class DisplayBox
{
	public static void main(String[] args)
	{
		
		int width, height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\t**** DISPLAY BOX ****");
		
		System.out.print("\n\tEnter the width: ");
		width = input.nextInt();
		
		System.out.print("\n\tEnter the height: ");
		height = input.nextInt();
		
		box(width,height);
		
		
	}
	
	public static void drawBar(int width) {

		for (int i = 1; i <= width; i++) {
		System.out.print("* ");
		}
		
		System.out.println();
	}
	
	public static void box(int width, int height) {
		
		for (int i = 1; i <= height; i++){
		
			drawBar(width);
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
