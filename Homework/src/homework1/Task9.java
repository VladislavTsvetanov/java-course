package homework1;

import java.util.Scanner;

public class Task9 {

	public static void main(String []args){
		
		int a,b,rest;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a=");
		a = sc.nextInt();
		
		System.out.println("Enter b=");
		b = sc.nextInt();
		
		rest = a%b;
		
		System.out.println("Rest = " + rest);
		
	}
}
