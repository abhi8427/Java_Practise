package nov1724;

import java.util.Scanner;

public class Sum1 {
	
	public static void main(String ab[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number: ");
		
		int firstnum = scan.nextInt();
		
		System.out.println("Please enter second number: ");
		
		int secondnum = scan.nextInt();
		
		int sum = firstnum + secondnum;
		
		System.out.println("Sum of the two numbers is : " + sum);
	}

}
