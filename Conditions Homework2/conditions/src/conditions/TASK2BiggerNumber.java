package conditions;

import java.util.Scanner;

public class TASK2BiggerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a: ");
		int a = sc.nextInt();
		System.out.println("enter b: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("a is bigger than b");

		} else {
			System.out.println("b is bigger than a");
		}
	}

}
