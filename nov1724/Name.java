package nov1724;

import java.util.Scanner;

public class Name {

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name = scan.nextLine();
		System.out.println("Hello " + name + " How are you doing today?");
	}
}
