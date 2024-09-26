package ArrayList;

import java.util.ArrayList;

public class arrayList003 {
	
	public static void main (String abhi[]){
		
		ArrayList city = new ArrayList();
		
		city.add("Kanpur");
		city.add("Gaziabad");
		city.add("Delhi");
		city.add("Chandigarh");
		city.add("Mumbai");
		
		int size = city.size();
		System.out.println("The total cities are "+size);
		System.out.println("The number of cities I have lived "+city);
		
		if(city.isEmpty()){
			System.out.println("There is no city");
		}else{
			System.out.println("There are cities avilable");
		}
		
		if(city.contains("Brampton")){
			System.out.println("You also lived in CaNADa");
		}else{
			System.out.println("You have never travel to abroad");
		}
		
		city.add(1, "Lucknow");
		city.add(2, "Allahabad");
		
		System.out.println("The new list of the cities "+city);
		
		city.set(5, "Saskatchewan");
		System.out.println("The new list of cities " +city);
		
		//city.remove("Delhi");
		//System.out.println("The updated city are "+city);
	}

}
