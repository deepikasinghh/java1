import java.util.Scanner;
public class primeornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int a = sc.nextInt();
		
		if(a==2) {
			System.out.println("prime no");
		} else {
			boolean isPrime=true;
			for(int i=2; i<=Math.sqrt(a); i++) {
				if(a%i==0) {
					isPrime=false;
				}
			}
			if(isPrime==true) {
				System.out.println("prime no");
			} else {
				System.out.println("not prime");
			}
		}
		
		
	}

}
// i<=n-1  or   Math.sqrt(a)