package tasks;

public class task4 {

	public static void main(String[] args) {

		for (int i = 30; i >= 1; i--) {
			System.out.printf("%-5d", i);
			if ((i-1) % 6 == 0) {
				System.out.println();
			}
		}

	}

}
