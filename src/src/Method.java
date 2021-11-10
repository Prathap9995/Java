
public class Method {
int a =10;
	 void m1(int a) {   				//instance method
		 System.out.println("m1 method");
		 System.out.println(this.a);
		m2();
		 
	 }
static void m2() {				//Static method
	 System.out.println("m2 method");

	
}
  public static void main(String[] args) {
	 Method m = new Method();
	 
	 m.m1(100);					//call by object --> here we should pass parameter value
	 Method.m2();				//call by class name
  }
}
