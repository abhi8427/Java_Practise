package march_19_2024;

import java.util.ArrayList;

public class StudentName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList sName = new ArrayList();
		sName.add("Abhishek");
		sName.add("Akshita");
		sName.add("Shashi");
		
		int size = sName.size();
		System.out.println(size);
		
		sName.add("Shipra");
		sName.add(3, "Shweta");
		
		System.out.println("The List is "+sName);

	}

}
