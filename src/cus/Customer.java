package cus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Customer {
	private String cusId;
	private String fullName;
	private boolean gender;
	private Date birthday;
	private String address;
	private String email;
	private String telephone;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String cusId, String fullName, boolean gender, Date birthday, String address, String email,
			String telephone) {
		super();
		this.cusId = cusId;
		this.fullName = fullName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.telephone = telephone;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma khach hang:");
		cusId = sc.nextLine();
		System.out.println("Nhap ho ten khach hang:");
		fullName = sc.nextLine();
		System.out.println("Nhap gioi tinh:");
		gender = Boolean.parseBoolean(sc.nextLine());
		System.out.println("Nhap ngay sinh:");
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		try {
			birthday = s.parse(sc.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Nhap que quan:");
		address = sc.nextLine();
		System.out.println("Nhap email:");
		email = sc.nextLine();
		System.out.println("Nhap so dien thoai:");
		telephone = sc.nextLine();
	}
	
	public void display(){
		System.out.println("\tMa khach hang: "+cusId);
		System.out.println("\tHo ten: "+fullName);
		System.out.println("\tGioi tinh: "+(gender?"Nam":"Nu"));
		System.out.println("\tNgay sinh: "+birthday);
		System.out.println("\tQue quan: "+address);
		System.out.println("\tEmail: "+email);
		System.out.println("\tSo dien thoai: "+telephone);
	}
}
