package nov1724;

import java.util.Scanner;

public class Product2 {
	
	public static void main(String ab[]){
		
		Product2 p2 = new Product2();
		p2.numProduct();
		
	}
	
	public void numProduct(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number :");
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		
		int mul = num1*num2;
		System.out.println("The Product of two numnbers is : " +mul);
	}

}
