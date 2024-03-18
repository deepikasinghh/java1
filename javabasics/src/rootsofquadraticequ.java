import java.util.Scanner;
public class rootsofquadraticequ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of a,b,c");
		double a,b,c,d;
		a=sc.nextInt();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=b*b-4*a*c;
		if(d>0) {
			double r1=(-b+Math.sqrt(d)/(2*a));
			double r2=(-b-Math.sqrt(d)/(2*a));
			System.out.println(r1);
			System.out.println(r2);
			System.out.println("real and different roots");
		} else if (d==0) {
			double r0= -b/(2*a);
			System.out.println(r0);
			System.out.println("real and equal roots");
		} else {
			double rp= -b/(2*a);
			double ip= Math.sqrt(-d)/(2*a);
			System.out.println(rp);
			System.out.println(ip);
			System.out.println("complex and different roots");
		}

	}

}
