
import java.util.Scanner;

public class InvertPyramid {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int i, j;
		for (i = n; i >= 1; --i) {
			for (j = 1; j <= n - i; ++j) {
				System.out.print(" ");
			}
			for (j = i; j <= 2 * i - 1; ++j) {
				System.out.print("* ");
			}
			for (j = 0; j < i - 1; ++j) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
}
