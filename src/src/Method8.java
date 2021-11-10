class Ep{}
class Z{}
public class Method8 {
Ep m1(int a) {  					//calling class method from another module of the application
	Ep e = new Ep();		//creating new object
	System.out.println("Prathap");
	return e;				//returning value --> we can call it "return new Ep();" 
}
static Z m2() {
	
	System.out.println("Barkur");
	return new Z();  //calling in project level 
	
}
String m3() {
	return "Corejava";
	
}
Method8 m4() {   		// Using current class as a method return type
	Method8 t = new Method8();			//Call by object	
	return t;			//returning the value   --> "return new Method8"
}
Method8 m5() {
	System.out.println("Barkur");
	return this;  // another method to return the value and it is always recommended
}

public static void main(String[] args) {
	Method8 m = new Method8();
	Ep e = m.m1(100);					//To store Ep value
	System.out.println(e);			//call the output
	Z x1 = Method8.m2();			//Call by class name and to store Z value  --> we can name any variable
	System.out.println(x1);			//call the output
	String str = m.m3();			
	System.out.println(str);		//call the output
	Method8 s = m.m4();
	System.out.println(s);
	Method8 t = m.m5();
	System.out.println(t);
	Method9 y = new Method9();   //calling a method from another module
	System.out.println(y.m3(10));
	
}







}
