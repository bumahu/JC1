package contructer;

public class test {
	public static void main(String[] args) {
		Student s1,s2;
		s1 = new Student();
		s2 = new Student("b8635", "Hung", 24, "c1903i");
		
		s1.setStuId("b8666");
		s1.setFullName("son");
		s1.setAge(24);
		s1.setClassName("c1903i");
		
		System.out.println("Ma sinh vien: "+s2.getStuId());
		System.out.println("Ten sinh vien: "+s2.getFullName());
		System.out.println("Tuoi sinh vien: "+s2.getAge());
		System.out.println("Lop: "+s2.getClassName());
	}
}
