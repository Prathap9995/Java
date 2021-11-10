
public class Super {  //Super class variable
	int i =10;
	int j = 20;
	
	
	
 class Child extends Super{
		int a =100;
		int b=100;
		int i =20;
		int j = 40;
		void add(int k, int l) {
			System.out.println(a+b);  // Different variable name...then dont need of Super keyword 
			System.out.println(k+l);
			System.out.println(i+j);
		}
		void m1(int i, int j) {   // Variable name is same hence by using "this" and "Super" keyword.
			System.out.println(i+j);
			System.out.println(this.i+this.j);
			System.out.println(super.i+super.j);
			
		
		}}
		public static void main(String[] args) {
			Child c = new Super().new Child();
			c.add(10,30);
			c.m1(30,40);
		
	}

 }


//When we have same method name we are using "this" and "super" keyword to get respective data.


