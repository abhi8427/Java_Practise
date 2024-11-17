package nov1724;

import java.util.Scanner;

public class Sub1 {
	
	public static void main(String ab[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number :");
		
		int num1 = scan.nextInt();
		
		System.out.println("Please enter the second number");
		
		int num2 = scan.nextInt();
		
		if(num1>num2){
			int sub = num1-num2;
			System.out.println("The substraction of two numbers is : "+sub);
		}else
		{
			int sub = num2-num1;
			System.out.println("The subtraction of two numbers is: "+ sub);
		}
	}

}
