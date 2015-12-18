package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n =");
		int n = sc.nextInt();
		
		int[] arr = new int [n];
		int[] reversed = new int [n];
		
		for(int i = 0; i<n;i++){
	
			arr[i] = sc.nextInt();
			
		}
		
		
		for(int i=0; i<n;i++){
			
		reversed[n-i-1] = arr[i];
			
		}
		System.out.println(Arrays.toString(reversed));
		
	}

}
