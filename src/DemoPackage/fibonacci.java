package DemoPackage;

public class fibonacci {
	
	
	// fibonacci series 1,1,2,3,5,8,13.....
	
	
	// get the given number
	// check the number is greater than 1, then call the same method and reduce the number until 1
	
	public static void main(String[] args) {
		isfibonacci(10);
	}
	
//	
//	public static void isfibonacci(int number) {
//		int n1=0,n2=1,n3=0;    
//		
//		if(number > 0) {
//			n3 = n1+n2;
//			n1 = n2;
//			n2 = n3;
//			System.out.print(" "+n3);
//			isfibonacci(number-1);
//		}
//		
//		
//		
//	}
	
	
	//class FibonacciExample2{  
//		 static int n1=0,n2=1,n3=0;    
//		 static void printFibonacci(int count){    
//		    if(count>0){    
//		         n3 = n1 + n2;    
//		         n1 = n2;    
//		         n2 = n3;    
//		         System.out.print(" "+n3);   
//		         printFibonacci(count-1);    
//		     }    
//		 }    
//		 public static void main(String args[]){    
//		  int count=10;    
//		  System.out.print(n1+" "+n2);//printing 0 and 1    
//		  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
//		 }  
//		}  
	
	static int i1 = 1, i2 = 2, i3 = 0;
	
	static void isfibonacci(int count) {
		System.out.print(i1 +" " + i2);
		for (int i = 2; i <count; i++) {
			i3 = i1+i2;
			i1 = i2;
			i2 = i3;
			System.out.print(" "+i3);
		}
	}
}
	

	

	
	
	
	// need to select from country drop down, multi select india and US
	
	// select class and multiple select enabled
	

	
	
	
	

