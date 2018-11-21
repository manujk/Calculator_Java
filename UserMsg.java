package javaTutorial;

import java.util.Scanner;

public class UserMsg {

	public static void main(String[] args) {
		String s;
		Scanner input_msg = new Scanner(System.in);
		
		System.out.println("Enter a message : ");
		s = input_msg.nextLine();
		System.out.println("You entered msg : " + s);
		
	}

}
