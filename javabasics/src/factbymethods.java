import java.util.*;
public class factbymethods {
	public static int fact(int n) {
		int f=1;
		for (int i=1; i<=n; i++) {
			f *=i;
		}
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the factorial");
		int n = sc.nextInt();
		System.out.println(fact(n));

	}

}
