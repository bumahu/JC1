package cus;

import java.util.Scanner;

public class DanhSachKhachHang {
	public static void main(String[] args) {
		Customer[] mang;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so khach hang:");
		n = sc.nextInt();
		
		mang = new Customer[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin khach hang thu "+(i+1));
			Customer c = new Customer();
			c.input();
			mang[i] = c;
		}
		
		System.out.println("\nThong tin cac khach hang:");
		for (Customer c : mang) {
			System.out.println("Khach hang:");
			c.display();
		}
	}
}
