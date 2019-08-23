
import java.util.Scanner;

public class StarPyramid {
	public static void PyramidPattern(int n) {
		int i;
		for(i=0;i<n;i++) {
	
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}


public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=scan.nextInt();
	
	PyramidPattern(num);
	scan.close();
}
}
