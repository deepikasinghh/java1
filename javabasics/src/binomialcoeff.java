import java.util.*;
public class binomialcoeff {
	public static int fact(int n) {
	int f=1;
	for (int i=1; i<=n; i++) {
		f *=i;
	}
	return f;
}
public static int bincoeff(int n, int r) {
	int f_n = fact(n);
	int f_r= fact(r);
	int f_nmr= fact(n-r);
	int bincoeff= f_n /(f_r*f_nmr) ;
	return bincoeff;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n and r");
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(bincoeff(n,r));

	}

}
