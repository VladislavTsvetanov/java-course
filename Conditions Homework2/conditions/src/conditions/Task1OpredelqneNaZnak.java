package conditions;

import java.util.Scanner;

public class Task1OpredelqneNaZnak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter two nums: ");

		int a = input.nextInt();
		int b = input.nextInt();

		if (a > 0 && b > 0) {
			System.out.println("+");
		}
		if (a > 0 && b < 0) {
			System.out.println("-");

		}
		if (a < 0 && b > 0) {
			System.out.println("-");
		}
		if (a < 0 && b < 0) {
			System.out.println("+");
		}
	}

}
