package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i = 0; i<10; i++){
			
			arr[i] = sc.nextInt();
			arr[i] = 2 * arr[i];
		}
		System.out.println(Arrays.toString(arr));

	}

}
