
public class Task8 {

	public static void main(String[] args) {
		String str = "";
		int num = 5;
		
		for (int i = 1; i <= num; str += i++ + "");
		
		perm("", str);
	}
	
	private static void perm(String prefix, String str) {
		int n = str.length();
		
		if (n == 0) {
			System.out.println(prefix);
			return;
		}
		
		for (int i = 0; i < n; i++) {
            perm(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
		}
	}

}
