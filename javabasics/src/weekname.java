import java.util.Scanner;

public class weekname {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the day");
		int week = sc.nextInt();
		switch(week) {
		case 7: System.out.println("sunday");
		break;
		case 6: System.out.println("saturday");
		break;
		case 5: System.out.println("friday");
		break;
		case 4: System.out.println("thursday");
		break;
		case 3: System.out.println("wednesday");
		break;
		case 2: System.out.println("tuesday");
		break;
		case 1: System.out.println("monday");
		break;
		default: System.out.println("end");
		}
	}

}
