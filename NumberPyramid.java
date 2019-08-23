

import java.util.Scanner;

public class NumberPyramid {
	public static void NumPyramid(int n) {
		int i, j, num;
		for (i = 0; i < n; i++) {
			num = 1;
			for (j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		NumPyramid(number);
		scan.close();
	}
}
