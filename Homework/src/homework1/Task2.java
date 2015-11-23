package homework1;

import java.util.Scanner;

public class Task2 {

	public static void main (String [] args){
		
		int a=5;
		int b=8;
		
		System.out.print("a=");
		a = a * b; // a=5*8 =40
		b = a / b; // b = 40/8=5
		a = a / b; // a = 40/5=8
		
		System.out.println(a);
		
		System.out.print("b=");
		System.out.println(b);
		
	}
}
