package conditions;

import java.util.Scanner;

public class Task5Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter a : ");
		int a = input.nextInt();

		System.out.println("enter b :");
		int b = input.nextInt();

		System.out.println("enter c :");
		int c = input.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("triangle exists");
		} else {
			System.out.println("triangle does not exist");
		}
	}

}
