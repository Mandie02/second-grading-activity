import java.util.*;

public class LimbagaStringSort2{
	public static void main(String[] args){

		int[] number = new int[20];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < number.length; i++){
			System.out.print("Enter a Number: ");
			int user = scan.nextInt();
			number[i] = user;
		}
		System.out.println("Output: \n");
		Arrays.sort(number);
		for(int num : number){ System.out.println(num);}
	}
}