package homework1;

import java.util.Scanner;

public class Task1 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float width,height,s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Width = ");
		 width = sc.nextFloat();
		 
		System.out.println("Height = ");
		height = sc.nextFloat();
		
		s = width*height;
		
		System.out.print("S = ");
		System.out.println(s);
	}

}
