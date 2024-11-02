package Nov2nd;

class Room{
	
	float length;
	float width;
	
	void getdata(float a, float b){
		length = a;
		width = b;
	}
}

public class RoomArea {
	
	public static void main(String args[]){
		
		float area;
		
		Room room1 = new Room();
		room1.getdata(20, 30);
		area = room1.length*room1.width;
		System.out.println("Area of the room is = " + area);
		
	}

}


