
public class SuperMethod {
	{
		System.out.println("Prathap"); // ----> Instance block
	}
	static {
		System.out.println("Prathap");
	}
 void m1() {
	 
	 System.out.println("m1 method");
 }
 class ChildMethod extends SuperMethod{
	 void m1() {
		 System.out.println("Child m1 method");
		 
	 }
	public ChildMethod(int a){
		System.out.println(" ");
	}
	 void m2() {
		 this.m1();  //It will display current class 
		 super.m1(); //It will represent parent class
		 m1();       // Current class
		m1();        //Current class
	 }
 }
	public static void main(String[] args) {
		ChildMethod c = new SuperMethod().new ChildMethod(10);
		c.m1();
        c.m2();
        
	}

}



//When we have same method name we are using "this" and "super" keyword to get respective data.