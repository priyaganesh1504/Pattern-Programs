

import java.util.Scanner;

public class NoInvertPyramid {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		int i,j,k=0;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			while(k!=2*i-1) {
				System.out.print("* ");
				k++;
			}
			k=0;
			System.out.println();
		}
	}
}
