
public class starprint {

	public static void main(String[] args) {
//		for (int i=1;i<=4; i++) {
//			for (int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		int n=4;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
// outer loop --> i --> no of lines
//inner loop --> j --> no of times -->star
//what to print --> *