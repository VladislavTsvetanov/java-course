package conditions;

import java.util.Scanner;

public class Task7SwitchCards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String cards = input.next();

		switch (cards) {
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "Q":
		case "K":
		case "A":
			System.out.println("valid card");
			break;

		default:
			System.out.println("invalid card");
			break;

		}
	}

}
