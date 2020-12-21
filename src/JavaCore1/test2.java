package JavaCore1;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen duong n: ");
		n =sc.nextInt();
		System.out.println("Day so fibonasy tu 1 den"+n+ "la: ");
		int f0=0;
		int f1=1;
		while (f1<n) {
			System.out.print(f1+"\t");
			f1=f0+f1;
			f0=f1-f0;
		}
	}
}
