
package conditions;

import java.util.Scanner;

public class Task6BonnusPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your score :[1-9]");
		int Score = input.nextInt();
		if (Score >= 1 && Score <= 3) {
			System.out.println(Score * 5);

		}
		if (Score >= 4 && Score <= 6) {
			System.out.println(Score * 10);
		}

		if (Score >= 7 && Score <= 9) {
			System.out.println(Score * 50);

		}

	}

}
