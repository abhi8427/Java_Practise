package nov1724;

import java.util.Scanner;

public class Sum2 {

	
	public static void main(String ab[]){
		
		Sum2 s2 = new Sum2();
		s2.sum();
		
	}
	
	public void sum(){
		System.out.println("Please enter first number: ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Please enter the second number :");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		System.out.println("The sum of the two numbers is : " + sum);
	}
}
