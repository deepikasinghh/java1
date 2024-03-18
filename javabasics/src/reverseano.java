import java.util.Scanner;
public class reverseano {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the no to be reversed");
//		int a = sc.nextInt();
//		int rev;
//		 while(a>0) {
//			 rev=a%10;
//			 System.out.print(rev);
//			 a=a/10;
//		 }
//		 System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int n=sc.nextInt();
		int rev=0;
		
		while(n>0) {
			int ld = n%10;
			rev=rev*10+ld;
			n=n/10;

		}
		System.out.println(rev);
	}

}
// extract last digit --> n%10
// remove last digit --> n/10