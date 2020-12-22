package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import program.ProgramingBook;

public class Test {
	public static void main(String[] args) {
		List<ProgramingBook> list = new ArrayList<ProgramingBook>();
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sach lap trinh:");
		n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sach thu "+(i+1));
			ProgramingBook pb = new ProgramingBook();
			pb.input();
			list.add(pb);
		}
		
		System.out.println("\nThong tin cac sach lap trinh:");
		for (ProgramingBook pb : list) {
			pb.display();
		}
	}
}
