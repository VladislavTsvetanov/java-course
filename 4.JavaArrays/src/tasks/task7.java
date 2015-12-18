package tasks;

import java.util.Scanner;

public class task7 {
	public static void main(String[] args) {
		int n = 10 + (int)(Math.random() * 20);
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = (int)(Math.random() * 1000);
		}

		System.out.println("Elements: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Enter number to search: ");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		s.close();
		int index = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				index = i;
				break;
			}
		}
		
		System.out.println("Index of element: " + index);
		
	}
}
