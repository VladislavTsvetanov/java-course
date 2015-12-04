
public class Task6 {

	public static void main(String[] args) {
		String str = "KJjbfhgdshHJGHJD";
		System.out.println(str + " reversed is " + reverse(str));
	}
	
	private static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
