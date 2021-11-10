
public class StaticVariable {
	static int a = 100;  //Static variable
	static int b= 200;
	public static void main(String[] args) {  //Static area
		System.out.println(StaticVariable.a);  //Call directly using Class name
		System.out.println(StaticVariable.b);
		StaticVariable S = new StaticVariable();  //Calling object to get method m1 output
		S.m1();
		S.m2();
	} 
	void m1() { //Instance area
		System.out.println(StaticVariable.a);  //Call directly by using class name
		System.out.println(StaticVariable.b);
	}  
	//example
	void m2() {
		StaticVariable t =new StaticVariable();  //create object to variable
		System.out.println(StaticVariable.a);
		System.out.println(a);
		System.out.println(t.a);
	}

}



/*We can access static variable in 3 ways i,e
1) Access by using class name
2)Access directly
3)access by creating object an call by object*/

// example

