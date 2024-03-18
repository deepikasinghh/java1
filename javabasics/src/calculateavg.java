import java.util.Scanner;
public class calculateavg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int s=sc.nextInt();
		for(int i=1; i<=25; i++) {
			System.out.println(i);
			sum +=s;
		}
		double avg = s/25;
		System.out.println(avg);

	}

}
