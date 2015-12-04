import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.print("Name > ");
		Scanner s = new Scanner(System.in);
		System.out.println();
		greet(s.next());
		s.close();
	}
	
	private static void greet(String name) {
		System.out.println("Greetings, " + name + "!");
	}

}
