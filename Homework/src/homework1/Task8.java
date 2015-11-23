package homework1;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a =");
		a = sc.nextInt();
	
		if(a%2==0)
			System.out.println("Number is even.");
		else
			System.out.println("Number is odd.");

	}

}
