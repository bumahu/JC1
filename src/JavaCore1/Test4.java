package JavaCore1;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		int n;
		float [] mang;
		System.out.println("Nhap so phan tu cua mang: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		mang=new float[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu "+(i+1));
			mang[i]=sc.nextFloat();
		}
		System.out.println("Mang vua nhap la: ");
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i]+"\t");
					}
	}
}
