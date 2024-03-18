import java.util.Scanner;
public class oddevenbyifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		int a=sc.nextInt();
		if (a%2==0) {
			System.out.println("even no");
		} else {
			System.out.println("odd no");
		}

	}

}
