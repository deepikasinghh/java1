import java.util.Scanner;
public class continuekeyword {

	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			if(i==4) {
//				continue;
//			}
//			System.out.println(i);
//		}
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter a no.");
			int n = sc.nextInt();
			if(n%10==0) {
				continue;
			}
			System.out.println(n);
		} while (true);
		
		
	}

}
