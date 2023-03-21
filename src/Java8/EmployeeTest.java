package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee("Manikandan", 30, "Male", 25000));
		employeeList.add(new Employee("Ram", 32, "Male", 30000));
		employeeList.add(new Employee("Gopal", 25, "Male", 10000));
		employeeList.add(new Employee("Lady1", 31, "Female", 22000));
		employeeList.add(new Employee("Lady2", 28, "Female", 15000));

		// Q1: Get the total number of male employees

		Long maleGender = employeeList.stream().map(Employee::getGender).filter(e -> e.equalsIgnoreCase("female"))
				.collect(Collectors.counting());

		System.out.println("Total male employees are: " + maleGender);

		// Q2: Get the highest salary amoung the employees

		OptionalInt maxSalary = employeeList.stream().mapToInt(Employee::getSalary).max();

		System.out.println("Highest salary is:" + maxSalary);

		// Q3: Get the lowest saalry employee details
		Optional<Employee> minSalary = employeeList.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println("Minimum salary is: " + minSalary);
		
		Map<String, Long> result = employeeList.stream().collect(Collectors.groupingBy(Employee :: getName, Collectors.counting()));
		
		System.out.println(result);
		
		
		String name = "manikandan";
		
		Map<Character, Long> collect = name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		collect.forEach((l,m) -> {
			if (m > 1) {
				System.out.println("repeated chars of " + l + "is" + m ) ;
			}
		});
		
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		OptionalInt max = l1.stream().mapToInt(c -> c).max();
		
		System.out.println(max);
		
		
	}

}
