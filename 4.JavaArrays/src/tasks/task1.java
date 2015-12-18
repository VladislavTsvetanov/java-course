package tasks;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		System.out.println("Enter n:");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();

			System.out.println("arr[" + i + "]=" + arr[i]);

			if (arr[i] % 2 == 0)
				sum += arr[i];

		}
		sc.close();
		System.out.println("The sum is:" + sum);
	}

}