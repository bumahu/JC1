package book;

import java.util.Scanner;

public class Book {
	private String isbn; // international standard book number
	private String bookName;
	private String author;
	private String publisher;
	private int yearPublish;
	private double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, String bookName, String author, String publisher, int yearPublish, double price) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.yearPublish = yearPublish;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublish() {
		return yearPublish;
	}

	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sach:");
		isbn = sc.nextLine();
		System.out.println("Nhap ten sach");
		bookName = sc.nextLine();
		System.out.println("Nhap ten tac gia:");
		author = sc.nextLine();
		System.out.println("Nhap nha xuat ban:");
		publisher = sc.nextLine();
		System.out.println("Nhap nam xuat ban:");
		yearPublish = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap gia ban:");
		price = Double.parseDouble(sc.nextLine());
	}
	
	public void display(){
		System.out.println("\tMa sach: "+isbn);
		System.out.println("\tTen sach: "+bookName);
		System.out.println("\tTac gia: "+author);
		System.out.println("\tNha xuat ban: "+publisher);
		System.out.println("\tNam xuat ban: "+yearPublish);
		System.out.println("\tGia tien: "+price);
	}
}
