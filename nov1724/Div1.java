package nov1724;

import java.util.Scanner;

public class Div1 {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number : ");
		
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number : ");
		
		int num2 = scan.nextInt();
		
		if(num1>num2){
			int div = num1/num2;
			System.out.println("The divison of two numbers is : "+div);
		}else{
			int div = num2/num1;
			System.out.println("The divison of two numbers is : "+div);
		}
		
		
	}

}
