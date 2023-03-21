package DemoPackage;

import java.util.Collections;
import java.util.LinkedList;


public class findClosestNumbertoZero {

	public static void main(String[] args) {
		 int[] arr = {10, 2, -2 , 3, 5, -1};
	      
	      for (int i=0;i< arr.length;i++){
	          System.out.println(arr[i]);
	      }
	      
	      LinkedList<Integer> l1 = new LinkedList<Integer>();
	      LinkedList<Integer> l2 = new LinkedList<Integer>();
	      
	      for (int i=0; i< arr.length;i++){
	          if (arr[i] < 0){
	              l1.add(arr[i]);
	          }
	          else{
	              l2.add(arr[i]);
	          }
	      }
	      
	      
	      System.out.println(l1);
	      System.out.println(l2);
	      
	      Collections.sort(l1,Collections.reverseOrder());
	      Collections.sort(l2);
	      
	      System.out.println(l1);
	      System.out.println(l2);
	      
	      
	      if (l1.get(0) > (l2.get(0))*(-1)) {
	    	  System.out.println(l1.get(0));
	      }
	      else if (l1.get(0) < (l2.get(0)*(-1))){
	    	  System.out.println(l2.get(0));
	      }
	      else if (l1.get(0) == (l2.get(0))*(-1)) {
	    	  System.out.println(l1.get(0));
	      }
	     
	      

	}

}
