package JavaCore1;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Nhap so nguyen duong n: ");
		n=sc.nextInt();
		if (n<1) {
			System.out.println("Nhap lai n");			
			}
		} while(n<1);
		double c=0;
		for (int i = 1; i <=n; i++) {
			long giaithua =1;
			for (int j = 1; j <= i; j++) {
				giaithua = giaithua*j;
			}
			double mu = Math.pow(-1, i-1);
			c= c + mu*1/giaithua;
			
			
		}
		System.out.println("Tich cua day la: "+c);
		
	}
}
/*/ c= /*/