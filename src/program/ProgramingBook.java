package program;

import java.util.Scanner;

import book.Book;

public class ProgramingBook extends Book{
	private String programLanguage;
	private String countryLanguage;
	public ProgramingBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProgramingBook(String isbn, String bookName, String author, String publisher, int yearPublish, double price,
			String programLanguage, String countryLanguage) {
		super(isbn, bookName, author, publisher, yearPublish, price);
		this.programLanguage = programLanguage;
		this.countryLanguage = countryLanguage;
	}

	public String getProgramLanguage() {
		return programLanguage;
	}

	public void setProgramLanguage(String programLanguage) {
		this.programLanguage = programLanguage;
	}

	public String getCountryLanguage() {
		return countryLanguage;
	}

	public void setCountryLanguage(String countryLanguage) {
		this.countryLanguage = countryLanguage;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngon ngu lap trinh:");
		programLanguage = sc.nextLine();
		System.out.println("Nhap ngon ngu sach:");
		countryLanguage = sc.nextLine();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sach lap trinh:");
		super.display();
		System.out.println("\tNgon ngu lap trinh: "+programLanguage);
		System.out.println("\tNgon ngu quoc gia: "+countryLanguage);
	}
	
	
}
