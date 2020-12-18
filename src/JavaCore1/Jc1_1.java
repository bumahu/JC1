package JavaCore1;

import java.util.Scanner;

public class Jc1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long giaithua = 1;
		int n;
		System.out.println("Nhap vao so duong n: ");
		n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
			giaithua=giaithua * i;
		}
		System.out.println(n+"! = " +giaithua);
	}
}
