import java.util.Scanner;
public class whileloopsumofn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int a = sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=a) {
			sum += i;
			i++;
		}
		System.out.println(sum);

	}

}
