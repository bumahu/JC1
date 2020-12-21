package JavaCore1;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		int [] mang;
		System.out.println("Nhap so phan tu cua mang: ");
		n = sc.nextInt();
		mang = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu "+(i+1));
			mang[i]= sc.nextInt();
			
		}
		System.out.println("mang vua nhap la: ");
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i]+"\t");
			if ((i+1)%10==0) {
				System.out.println(	);
				
			}
		}
	}
}
