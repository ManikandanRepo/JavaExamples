package Java8;

public class Employee {

		
		private String name;
		private int age;
		private String gender;
		private int Salary;
		
		public Employee(String name, int age, String gender, int salary) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			Salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getSalary() {
			return Salary;
		}

		public void setSalary(int salary) {
			Salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", Salary=" + Salary + "]";
		}
		

	

}
