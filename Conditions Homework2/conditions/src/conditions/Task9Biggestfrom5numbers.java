package conditions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task9Biggestfrom5numbers {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		int a= input.nextInt();
		int b= input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		int e=input.nextInt();
		
        Integer[] arr = { a, b, c, d, e };
        int max = Collections.max(Arrays.asList(arr));
        System.out.println("Max:" + max);
}}