package DemoPackage;

import java.util.Arrays;
import java.util.Collections;

public class ReverseGivenString {

	public static void main(String[] args) {

		// 1. First get the string for sorting
		// 2. convert the string to chararray
		// 3. use two for loops and iterate and compare the two elements
		// 4. create temp char variable and swap the items according to sorting order

		String s = "manikandan";

		System.out.println(s);

		char[] c = s.toCharArray();

		/*
		 * Arrays.sort(c); System.out.println("Given string in ascending order- "
		 * +String.valueOf(c));
		 * 
		 * StringBuffer sb = new StringBuffer(String.valueOf(c));
		 * 
		 * sb.reverse();
		 * 
		 * System.out.println("Given string in decending order- " + sb);
		 */

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (c[i] < c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}

		System.out.println("Given string in ascending order- " + String.valueOf(c));

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (c[i] > c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}

		System.out.println("Given string in decending order- " + String.valueOf(c));

	}

}
