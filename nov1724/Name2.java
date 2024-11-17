package nov1724;

import java.util.Scanner;

public class Name2 {
	
	public static void main(String args[]){
		
		Name2 n2 = new Name2();
		n2.NamePrint();		
		
	}
	public void NamePrint(){
		System.out.println("Please enter your Name");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hello " + name +" How are you doing today?");
		
	}
	

}


