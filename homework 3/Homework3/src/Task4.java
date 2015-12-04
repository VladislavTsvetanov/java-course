
//PRITN EVEN OR ODD NUMBER
public class Task4 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " is ");
			printOddOrEven(i);
		}
	}
	
	private static void printOddOrEven(int a) {
		if (a == 0) {
			System.out.println("neither even nor odd");
		} else if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
