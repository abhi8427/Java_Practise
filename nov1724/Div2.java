package nov1724;

import java.util.Scanner;

public class Div2 {
	
	public static void main(String args[]){
		Div2 d2 = new Div2();
		d2.div();
		
	}
	
	public void div(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		
		if(num1>num2){
			int div = num1/num2;
			System.out.println("The division of two numbers :" +div);
		}else{
			int div = num2/num1;
			System.out.println("The division of two numbers : "+div);
		}
	}

}
