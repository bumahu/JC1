package JavaCore1;

import java.util.Scanner;

public class Jc1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,tongchan;
		System.out.println("Nhap so nguyen n1: ");
		n1=sc.nextInt();
		System.out.println("Nhap so nguyen n2: ");
		n2=sc.nextInt();
		
		tongchan=0;
		for (int i = n1; i < n2; i++) {
			if (i%2==0) {
				tongchan= tongchan + i;
				
			}
		}
		System.out.println("Tong cac so chan tu " +n1+ " den "+n2 + " la : " +tongchan);
	}
}
