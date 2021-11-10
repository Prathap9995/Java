class X{
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
	}
}    /* These class may be in another module of the project*/
class Y{}   /* Here we are calling the object of the another project*/
class Emp{}
class Student{}
public class Method2 {
	void m1(X a, Emp e) //passing parameters --> object 
	{  //instance method
		 System.out.println("m1 method");
		 System.out.println(a);
		 System.out.println(e);
	
	 }
static void m2(Y y, Student s) // passing parameters
{  //Static method
	 System.out.println("m2 method");
	 System.out.println(y);
	 System.out.println(s);}
	 
	 Y m3() {
		 System.out.println("p");
		 return new Y();
	 }

 public static void main(String[] args) 
 {  //Static method
	 Method2 m = new Method2();
	 X a = new X();   			// creating new classes objects
	 Emp e1 = new Emp();		// e1 ==> no need to give the same name
	m.m1(a, e1);				// In real time project we are using--> m.m1(new x(), new Emp());
	
	
	Y y1 = new Y();
	Student s = new Student();
	Method2.m2(y1, s);  // Method2.m2(new Y(), new Student());
m.m3();
Y y = m.m3();
System.out.println(y);
 
 }}



//Example passing parameter with object

