package DemoPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class DemoClass {

	static String var1 = null;
	public static void main(String[] args) {
		
		//https://techbeamers.com/java-coding-questions-software-testers/
		
		List<String> names = new ArrayList<>();
		
		names.add("Selenium");
		names.add("Jenkins");
		names.add("Docker");
		names.add("Maven");
		
		System.out.println(names);
		
//		names.forEach((x) -> System.out.println(x));
		names.forEach(System.out::println);
		
		List<String> l = List.of("mani","kandan");
		
		l.forEach(System.out::println);

		String s = "abc123";
		
		//int i = Integer.parseInt(s);
		
		System.out.println(s+10);
		
		System.out.println(Math.sqrt(100));
		
	}
	

}
