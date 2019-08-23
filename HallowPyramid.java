

import java.util.Scanner;

public class HallowPyramid {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Pattern(n);
		scan.close();
	}
		public static void Pattern(int n) {
		int i, j, k = 0;
		for (i = 1; i <= n; i++) {
			for (j = i; j < n; j++) {
				System.out.print(" ");
			}
			while (k != (2 * i - 1)) {
				if (k == 0 || k == 2 * i - 2) {
					System.out.print("*");
				} else
					System.out.print(" ");
				k++;
			}
			k = 0;
			System.out.println(" ");
		}
		for (i = 0; i < 2 * n - 1; i++) {
			System.out.print("*");
		}
	}
}
