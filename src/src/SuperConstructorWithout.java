
public class SuperConstructorWithout {

	public SuperConstructorWithout() {    // If we provide 1 or more argument constructor the code is invalid without super constructor calling.
		//Here object class default constructor will execute
		System.out.println("Prathap");
		// TODO Auto-generated constructor stub
	}
	static class Child extends SuperConstructorWithout{
		Child(){
			
			//If we not declared any this or super keyword Compiler will generate super keyword..... But compiler generated super will be always zero argument
			
			System.out.println("Shwetha");
		}
		Child(int a){
			//Compiler calls super class constructor ---> here it will not generate because we declared this keyword
			
			this();
			System.out.println("Barkur");
		}
	}

	public static void main(String[] args) {
		new Child();
		new Child(10);

	}

}


//In child class we are mention static because because it will show error while creating object to overcome from this problem we are declaring static or
// create object like :-
// Child C = new SuperCon().new Child();

/* where,

class Parent{
Parent()
{
System.out.println("Prathap");
}
class Child extends Parent
{

}
public static void main(String[] args)
{
new Child();
}


}
*/
//Defaualt child class constructor will be generates zero arg constructor
//Then compiler compiles Super constructor and output of super will execute here
