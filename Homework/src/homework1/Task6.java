package homework1;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r,s,p;
		double pi = 3.14;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter r =");
		r = sc.nextDouble();
		
		System.out.print("P = ");
		p = 2*pi*r;
		System.out.println(p);
		
		System.out.print("S = ");
		s = pi * r * r;
		System.out.println(s);
		
	}

}
