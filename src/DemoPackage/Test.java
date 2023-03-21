package DemoPackage;

		
	public class Test {
		
		public Test() {
			System.out.println("This is calling from test1 const");
		}
		
		public void boo() {
			System.out.println("This is inside test class!");
		}
		public static void main(String[] args) {
			Test2 t1 = new Test2();
			Test t2 = new Test2();
			
			t1.boo();
			t2.boo();
		}
			
	}
	
	class Test2 extends Test {
		public Test2() {
			System.out.println("This is calling from test2 const");
		}
		public void boo() {
			System.out.println("This is inside test2 class!");
		}
		
	}
	
	



