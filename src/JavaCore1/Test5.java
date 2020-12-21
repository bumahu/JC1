package JavaCore1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so phan tu cua  mang: ");
		n = sc.nextInt();
		String [] mang;
		mang = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu "+(i+1));
			mang[i]=sc.next();
		}
		System.out.println("Mang vua nhap la: ");
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i]+"\t");
		}
	}
}
