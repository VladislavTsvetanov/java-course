
public class Task3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int a = (int)(Math.random() * 100);
			int b = (int)(Math.random() * 100);
			int c = (int)(Math.random() * 100);
			System.out.println(a + "X" + b + "X" + c + " = " + mult(a, b, c));
		}

	}
	
	private static int mult(int a, int b, int c) {
		return a * b * c;
	}

}
