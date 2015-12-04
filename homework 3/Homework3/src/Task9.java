import java.util.Scanner;

//Printira chisla v obraten red

public class Task9 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = s.nextInt();
		}
		
		s.close();
		
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i] + " ");
		}

	}

}
