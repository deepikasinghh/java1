import java.util.Scanner;
public class greatestof2nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st no");
		int a=sc.nextInt();
		System.out.println("enter the 2nd no");
		int b=sc.nextInt();
		if (a>b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

}
