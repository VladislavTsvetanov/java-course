import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Vyvedete razmer");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		Matrix a = new Matrix(size);
		int choice;
		
		do {
			System.out.println("1 - Fill array");
			System.out.println("2 - Print max numbers info");
			System.out.println("0 - QUIT");
			choice = s.nextInt();
			
			if (choice == 1) {
				a.fill();
				a.print();
			} else if (choice == 2) {
				a.max();
			}
		} while (choice != 0);
		
		s.close();

	}

}
