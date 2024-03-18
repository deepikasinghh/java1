import java.util.Scanner;
public class ternaryoperator {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a no");
//		int a = sc.nextInt();
//		String type = ((a%2)==0)? "even": "odd";
//		System.out.println(type);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int a = sc.nextInt();
		String m = (a>=33)? "pass": "fail";
		System.out.println(m);
	}

}
