

import java.util.Scanner;

public class NumWithoutReAssigning {
	public static void numPyramid(int n) {
		int i,j,num=1;
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++) {
				System.out.print(num+" " );
				num=num+1;
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		numPyramid(number);
		scan.close();
	}
}
