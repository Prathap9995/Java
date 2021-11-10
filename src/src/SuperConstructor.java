
public class SuperConstructor {
	int a;

	public SuperConstructor() {
	System.out.println("Parent constructor");		
	}
	//public SuperConstructor(int a) {
	//	System.out.println("Parent 1 constructor");		
	//	}
 static class ChildConstructor extends SuperConstructor {  // We can remove static here and while creating object
	  														//	ChildConstructor C = new SuperConstructor().new ChildConstructor() ;
	ChildConstructor(){
		this(10);         // calling current class constructor
		//super();  --------> Shows error---> must be first statement.
		System.out.println("Child constructor");
		//super();  --------> Shows error---> must be first statement.
	}
	ChildConstructor(int a){
		super();    // calling super class constructor     ........super(10);
		this.a = 1;
		System.out.println("Child constructor 1 args");
	}
	void m1() {
		
			System.out.println("Child constructor value is :"+a);
		}
}
	

	public static void main(String[] args) {
		ChildConstructor c = new ChildConstructor();
		c.m1();
	}

}








//Super keyword must be first statement inside the constructor 
//Inside the constructor it is possible to use either "this" or "super" keyword. Both at a time not possible

/* class Parent{
}    -----> Default constructor
class Child extend Parent{
child()
{
super();
S.O.P(" prathap");            
}
P.S.V.M()
{
new Child();
} 
It is possible to call without any constructor inside the parent class

*/
