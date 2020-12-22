package literary;

import java.util.Scanner;

import book.Book;

public class LiteraryBook extends Book{
	private String bookType;
	private String countryLanguage;
	public LiteraryBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LiteraryBook(String isbn, String bookName, String author, String publisher, int yearPublish, double price,
			String bookType, String countryLanguage) {
		super(isbn, bookName, author, publisher, yearPublish, price);
		this.bookType = bookType;
		this.countryLanguage = countryLanguage;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
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
		System.out.println("Nhap loai sach:");
		bookType = sc.nextLine();
		System.out.println("Nhap ngon ngu quoc gia:");
		countryLanguage = sc.nextLine();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Sach van hoc:");
		super.display();
		System.out.println("\tLoai sach: "+bookType);
		System.out.println("\tNgon ngu quoc gia: "+countryLanguage);
	}
	
	
}
