import java.util.Scanner;
public class breakstat {

	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			if(i==3) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("i am out of the loop");
//			
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("enter a no");
			int a=sc.nextInt();
			if(a%10==0) {
				break;
			}
			System.out.println(a); 
		} while(true);
		
		
		
	}

}
