import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Next int > ");
			int nextInt = s.nextInt();
			max = maxNumber(max, nextInt);
			System.out.println();
		}
		
		s.close();
		System.out.println("Max: " + max);
	}
	
	private static int maxNumber(int a, int b) {
		return a > b ? a : b;
	}

}
