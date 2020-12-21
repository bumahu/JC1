package cus;

public class Test {
	public static void main(String[] args) {
		Customer c1, c2;
		
		c1 = new Customer();
		c1.input();
		c2 = new Customer();
		c2.input();
		System.out.println("Khach hang:");
		c1.display();
		System.out.println("Khach hang:");
		c2.display();
	}
}
