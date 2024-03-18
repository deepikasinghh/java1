import java.util.Scanner;
public class sumofevenoddintegrs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int esum=0;
		int osum=0;
		int c;
		 do {
			 System.out.println("enter a no");
			  n = sc.nextInt();
			 if (n%2==0) {
				 esum +=n;
			 } else {
				 osum += n;
			 }
			 System.out.println("press 1 for yes");
			 c=sc.nextInt();
		 }
		 while (c==1);
		 System.out.println(esum);
		 System.out.println(osum);
		

	}

}
