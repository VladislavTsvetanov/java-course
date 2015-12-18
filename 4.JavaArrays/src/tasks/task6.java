package tasks;

public class task6 {

	public static void main(String[] args) {
		int n = 10 + (int)(Math.random() * 20);
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = (int)(Math.random() * 1000);
		}
		
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1); j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}

		}
		System.out.println("After Bubble Sort the array is: ");
		for (int i : array) {
			System.out.print(i + " ");

		}
	}
}