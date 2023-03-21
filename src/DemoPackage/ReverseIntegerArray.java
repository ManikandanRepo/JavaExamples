package DemoPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		
		// 1. First get the integer arraylist for sorting
		// 2. get the size of the arraylist
		// 3. use two for loops and iterate and compare the two elements
		// 4. create two temp int variables and set the items according to sorting order

		List<Integer> numArrayList = new ArrayList<Integer> (Arrays.asList(1,3,2,4,5));

		System.out.println("before sorting" +numArrayList);
		
		/*
		 * Collections.sort(numArrayList); System.out.println("After collections sort:"
		 * + numArrayList);
		 * Collections.reverse(numArrayList);
		 * Collections.sort(numArrayList,Collections.reverseOrder());
		 * System.out.println("After collections reverse sort" + numArrayList);
		 */

		int lengthOfArray = numArrayList.size();

		for(int i=0;i<lengthOfArray;i++){
			for(int j=0;j<lengthOfArray;j++){
				if (numArrayList.get(i) < numArrayList.get(j)){
					int temp = numArrayList.get(i);
					int temp1 = numArrayList.get(j);
					numArrayList.set(i, temp1);
					numArrayList.set(j, temp);
		
				}
	}
			
}
		System.out.println("after sorting ascending" +numArrayList);
		
		for(int i=0;i<lengthOfArray;i++){
			for(int j=0;j<lengthOfArray;j++){
				if (numArrayList.get(i) > numArrayList.get(j)){
					int temp = numArrayList.get(i);
					int temp1 = numArrayList.get(j);
					numArrayList.set(i, temp1);
					numArrayList.set(j, temp);
				}
	}
			
}

		System.out.println("after sorting descending" +numArrayList);
	}
}

