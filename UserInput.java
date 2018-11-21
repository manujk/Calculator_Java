package javaTutorial;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter 2 integers to calculate their sum");
		Scanner user_input = new Scanner(System.in);
		
		x = user_input.nextInt();
		y = user_input.nextInt();
		z = x + y;
		
		System.out.println("Sum of 2 integers = " + z);
		
	}

}
