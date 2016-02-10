import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Matrix {
		int num;
		
		int[][] m;
		
		public Matrix(int num) {
			if (num < 2 || num > 9) {
				throw new IllegalArgumentException();
			}
			this.num = num;
			m = new int[num][num];
		}
		
		public void fill() {
			Random r = new Random();
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					m[i][j] = r.nextInt(100);
				}
			}
		}
		
		public void save() throws IOException {
			DataOutputStream out = new DataOutputStream(new FileOutputStream("out"));
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					out.writeInt(m[i][j]);
				}
			}
			out.close();
		}
		
		public void print() {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					System.out.print(m[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		public void max() {
			long sum = 0;
			int maxD1 = Integer.MIN_VALUE;
			int maxD2 = Integer.MIN_VALUE;
			for (int i = 0; i < num; i++) {
				int maxR = Integer.MIN_VALUE;
				int maxC = Integer.MIN_VALUE;
				for (int j = 0; j < num; j++) {
					if (maxR < m[i][j]) {
						maxR = m[i][j];
					}
					
					if (maxC < m[j][i]) {
						maxC = m[j][i];
					}
					
					if (maxD1 < m[i][i]) {
						maxD1 = m[i][i];
					}
					
					if (maxD2 < m[i][num - j - 1]) {
						maxD2 = m[i][num - j - 1];
					}
				}
				System.out.println("Row " + i + " max value " + maxR);
				System.out.println("Col " + i + " max value " + maxC);
				sum += maxR + maxC;
			}
			System.out.println("D1 max value " + maxD1);
			System.out.println("D2 max value " + maxD2);
			sum += maxD1 + maxD2;
			System.out.println("Sum: " + sum);
			
		}
		
	}
