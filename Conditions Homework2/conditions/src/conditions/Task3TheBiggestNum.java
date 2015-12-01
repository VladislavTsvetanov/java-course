package conditions;

import java.util.Scanner;

public class Task3TheBiggestNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter a :");
		int a = input.nextInt();

		System.out.println("enter b :");
		int b = input.nextInt();

		System.out.println("enter c :");
		int c = input.nextInt();

		if (a > b && a > c) {
			System.out.println("a is the biggest num");
		}
		if (b > a && b > c) {
			System.out.println("b is biggest num");
		}
		if (c > a && c > b) {
			System.out.println("c is the biggest num");
		}

	}

}
