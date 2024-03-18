import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
//		int c = 1;
//		while(c<11) {
//			System.out.print(c + " ");
//			c++;
//		}
//		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int a = sc.nextInt();
		int c = 1;
		 while(c<a) {
			 System.out.println(c + " ");
			 c++;
		 }
		 System.out.println();
	}

}
