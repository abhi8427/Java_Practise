package ArrayList;

import java.util.ArrayList;

public class arrayList002 {
	
	public static void main(String[] args) {
		
		ArrayList student = new ArrayList();
		student.add("Abhishek");
		student.add("Akshita");
		student.add("Shipra");
		
		int size = student.size();
		System.out.println("The number of students in the class is " + size);
		
		System.out.println("Student's name in the class " +student);
		
		student.add(2, "Shweta");
		System.out.println("Name of the students in the class " + student);
		
		if(student.contains("Sachin")){
			System.out.println("New Student is in the class");
			
		}else{
			System.out.println("Student is not in the class");
		}
		
		if(student.isEmpty()){
			System.out.println("Students are not in the class");
		}else{
			System.out.println("Students are in the class");
		}
		
		student.set(2, "Satyak");
		System.out.println("New list of the students is " + student);
		
		student.remove("Akshita");
		System.out.println("The new list of students " +student);
		
		student.add("Shweta");
		System.out.println("The new list of students "+student);
	}

}
