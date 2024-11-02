package Nov2nd;

public class CmdArg {
	
	public static void main (String args[]){
		int count, i = 0;
		String string;
		count = args.length;
		System.out.println("Number of argumets = " + count );
		while(i<count){
			string = args[i];
			i = i+1;
			System.out.println(i + " : " + " Abhishek is " + string + " !");
		}
	}

}
