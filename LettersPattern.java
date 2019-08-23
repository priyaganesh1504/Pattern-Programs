
public class LettersPattern {
	public static void main(String args[]){
		char last='E',alpha='A';
		int i,j;
		for(i=1;i<=last-'A'+1;++i) {
			for(j=1;j<=i;++j) {
				System.out.print(alpha+" ");
			}
			++alpha;
			System.out.println();
		}
	}
}
