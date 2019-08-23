

import java.util.Scanner;

public class TrianglePattern {
	public static void PrintTriangle(int n) {
		int i,j;
		for(i=0;i<n;i++) {
			for(j=n-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		scan.close();
		PrintTriangle(num);
	}
}
