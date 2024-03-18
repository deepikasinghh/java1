import java.util.Scanner;
public class productbymethods {
	public static int multi(int a, int b) {
		int p = a*b;
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nos");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		int prod = multi(a,b);
		System.out.println(multi(a,b));

	}

}
