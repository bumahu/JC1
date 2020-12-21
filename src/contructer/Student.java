package contructer;

public class Student {
		private String stuId;
		private String fullName;
		private int age;
		private String className;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(String stuId, String fullName, int age, String className) {
			super();
			this.stuId = stuId;
			this.fullName = fullName;
			this.age = age;
			this.className = className;
		}
		public String getStuId() {
			return stuId;
		}
		public void setStuId(String stuId) {
			this.stuId = stuId;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getClassName() {
			return className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		
		
}
