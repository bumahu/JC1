package JavaCore1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		int n;
		int [] mang;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		n= sc.nextInt();
		mang= new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu"+(i+1));
			mang[i]=sc.nextInt();
		}
		System.out.println("Mang vua nhap la: ");
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i]+"\t");
		}
		System.out.println();
		System.out.println("Cac phan tu nguyen to cua mang la: ");
		for (int i = 0; i < mang.length; i++) {
			int nt=0;
			for (int j = 2; j < mang[i]; j++) {
				
				if (mang[i]%j==0) {
					nt=1;
				}
			}
			if (nt==0) {
				System.out.print(mang[i]+"\t");
			}
			
		}
		
	}
}
