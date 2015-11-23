package homework1;

import java.util.Scanner;

public class Task5 {

	public static void main(String []args){
		
		int a,b,c,d,sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a = ");
		a = sc.nextInt();
		
		System.out.println("Enter b = ");
		b = sc.nextInt();
		
		System.out.println("Enter c = ");
		c = sc.nextInt();
		
		System.out.println("Enter d = ");
		d = sc.nextInt();
		
		sum = a + b + c + d;

		System.out.println("Sum = ");
		System.out.println(sum);
		
	}
}
