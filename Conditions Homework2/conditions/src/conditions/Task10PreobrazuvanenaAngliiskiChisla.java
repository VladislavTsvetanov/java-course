package conditions;

import java.util.Scanner;

public class Task10PreobrazuvanenaAngliiskiChisla {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");

		int YourNumber = input.nextInt();
		int Edinitsi = YourNumber % 10; // delim nasheto chislo na 10, za da
										// poluchim edinicite
		int Desetici = (YourNumber / 10) % 10; // delim na 10,za da gi premahnem
												// i sled tova pak delim s
												// ostatyk za deseticite
		int Stotici = YourNumber / 100; // pak delim chisloto na 100, za da
										// poluchim stoticite
		if (1 <= YourNumber && YourNumber <= 999)

			switch (Stotici) {

			case 1:
				System.out.print("One Hundred");
				break;
			case 2:
				System.out.print("Two Hundred");
				break;
			case 3:
				System.out.print("Three Hundred");
				break;
			case 4:
				System.out.print("Four Hundred");
				break;
			case 5:
				System.out.print("Five Hundred");
				break;
			case 6:
				System.out.print("Six Hundred");
				break;
			case 7:
				System.out.print("Seven Hundred");
				break;
			case 8:
				System.out.print("Eight Hundred");
				break;
			case 9:
				System.out.print("Nine Hundred");
				break;

			}
		if (Edinitsi == 0 && Desetici == 0) {
			System.out.print( "  " );
		}
		if (Edinitsi == 0 && Desetici != 0) {
			System.out.print("and");
		}

		switch (Desetici) {
		case 1:
			if (Stotici != 0 && (Desetici != 0 || Edinitsi > 0))

				System.out.println(" and ");

			switch (Desetici) {
			case 1:
				System.out.println("Eleven");
				break;
			case 2:
				System.out.println("Twelve");
				break;
			case 3:
				System.out.println("Thirteen");
				break;
			case 4:
				System.out.println("Fourteen");
				break;
			case 5:
				System.out.println("Fifteen");
				break;
			case 6:
				System.out.println("Sixteen");
				break;
			case 7:
				System.out.println("Seventeen");
				break;
			case 8:
				System.out.println("Eighteen");
				break;
			case 9:
				System.out.println("Nineteen");
				break;
			case 0:
				System.out.println("Ten");
				break;

			}
			break;

		case 2:
			System.out.println("Twenty");
			break;
		case 3:
			System.out.println("Thirty");
			break;
		case 4:
			System.out.println("Fourty");
			break;
		case 5:
			System.out.println("Fifty");
			break;
		case 6:
			System.out.print("Sixty");
			break;
		case 7:
			System.out.print("Seventy");
			break;
		case 8:
			System.out.print("Eighty");
			break;
		case 9:
			System.out.print("Ninety");
			break;
		case 0:
			break;

		}
		if (Desetici != 0) {
			if (Desetici != 0 || (Stotici != 0 && Edinitsi != 0)) {
				if (Edinitsi > 0) {
					
				}
				switch (Edinitsi) {

				case 1:
					System.out.print("One");
					break;
				case 2:
					System.out.print("Two");
					break;
				case 3:
					System.out.print("Three");
					break;
				case 4:
					System.out.print("Four");
					break;
				case 5:
					System.out.print("Five");
					break;
				case 6:
					System.out.print("Six");
					break;
				case 7:
					System.out.print("Seven");
					break;
				case 8:
					System.out.print("Eight");
					break;
				case 9:
					System.out.print("Nine");

					break;
				case 0:
					if (Desetici != 0)
						System.out.println("");
					break;
				}
			}
			if (Edinitsi == 0 && Desetici == 0 && Stotici == 0) {
				System.out.println("Zero");

			}
		} else {
			System.out.println("Out of Range!");
		}

	}

}
