package tasks;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n =");
		int n = sc.nextInt();
		
		int[] arr = new int [n];
		
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
			
		}
		
		boolean sym = true;
		
		for(int i = 0; i<(arr.length +1)/2;i++){
			if(arr[i] != arr[n-i-1])
				sym = false;
			
		}
		
		System.out.printf("Is the array symetric? %b", sym);

	}

}
