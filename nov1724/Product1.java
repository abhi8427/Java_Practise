package nov1724;

import java.util.Scanner;

public class Product1 {
	
	public static void main(String args[]){
		
		Scanner  scan =  new Scanner(System.in);
		
		System.out.println("Please enter first number :");
		
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number: ");
		
		int num2 = scan.nextInt();
		
		int multi = num1*num2;
		
		System.out.println("The product of two numbers is : " + multi);
	}

}
