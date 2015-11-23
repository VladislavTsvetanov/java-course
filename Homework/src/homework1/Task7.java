package homework1;

import java.util.Scanner;

public class Task7 {
	
	public static void main(String []args){
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a =");
		a = sc.nextInt();
		
			System.out.println(a%7 == 0 && a % 5 == 0);
	
	}
}
