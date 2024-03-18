import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int a = sc.nextInt();
		boolean x = a%4 == 0;
		boolean y = (a%100) !=0;
		boolean z = a%400 == 0;
		if (x && (y || z)) {
			System.out.println("leap year");
		} else {
			System.out.println("not a leap year");
		}

	}

}
