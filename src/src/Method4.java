
public class Method4 {
	 void m1() {   				//instance method
		m2(); //instance method calling
		 System.out.println("m1 method");    // out put is m2() method value and m3() method value
		 m3(7);
	 }
 void m2() {				//Static method
	
	System.out.println("m2 method");   // output will value of m2() method an m3() methods
	m3(5);
}
static void m3(int a) {
	System.out.println(a);
}
  public static void main(String[] args) {
	 Method4 m = new Method4();
	 m.m1();
	 m.m2();
	 Method4.m3(5);
}}


//calling a method inside of another method