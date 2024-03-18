import java.util.*;
public class calculatesum {
	public static int calsum(int a,int b) {
		
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nos.");
		int a = sc.nextInt();
		int b =sc.nextInt();
		int sum = calsum(a,b);
		System.out.println(sum);

	}

}
