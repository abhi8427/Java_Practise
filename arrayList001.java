package ArrayList;

import java.util.ArrayList;

public class arrayList001 {
	
	public static void main(String[] args) {
		
		ArrayList animal = new ArrayList();
		
		animal.add("Cat");
		animal.add("Cow");
		animal.add("Dog");
		animal.add("Elephant");
		
		System.out.println(animal); //Print the array list
		
		int size = animal.size();
		System.out.println(size);//Print the array list size
		
		animal.add(2, "Tiger");// add element at specific location
		System.out.println("New array list " +animal);
		
		if(animal.isEmpty()){
			System.out.println("Animal list is empty, Please add new animals");
		}else {
			System.out.println("There are animals in the list");
		}
		
		if(animal.contains("Zebra")){
			System.out.println("Zebrais in the list");
		}else{
			System.out.println("Please bring zebra from Africa");
		}
		
		animal.set(3, "Horse");// add a new and remove old (replace)
		System.out.println(animal);
		
		animal.remove("Cow");// remove element
		System.out.println(animal);
		
	}

}
