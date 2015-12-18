package tasks;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class task5 {

	public static void main(String[] args) throws IOException {
		int n = 10 + (int)(Math.random() * 20);
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = (int)(Math.random() * 1000);
		}

		Arrays.sort(array);
		System.out.println("Elements: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Enter number to binary search: ");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		s.close();
		System.out.println("Index of element: " + Arrays.binarySearch(array, number));
	}
	
}
