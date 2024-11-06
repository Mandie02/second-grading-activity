import java.util.*;

public class LimbagaStringSort{
	public static void main(String[] args){
		String names[] = new String[20];
		Scanner scan = new Scanner(System.in);

		for(int i =0 ; i < names.length; i++){
		
			System.out.print("Enter Name: ");
			String user = scan.next();
			names[i] = user;
		}
		
		Arrays.sort(names);
		//check if it's already 20 string values
		System.out.println("Number of Name: " + names.length + "\n");
		for(String name : names){ System.out.println(name); }
	}
}
