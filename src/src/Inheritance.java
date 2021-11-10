
public class Inheritance {
	

	void Parent() {
	System.out.println("Parent class");
	}
	 class Child extends Inheritance {   //Static is mandatory here
		void sub()
		{ 
			System.out.println("Child class");
		}
		
		
	}

	public static void main(String[] args) {
		Inheritance i = new Inheritance();
		i.Parent();
		
		Child c = new Inheritance().new Child();  // --> Always recommended to create object of child class
		// Child c = new Inheritance().new Child(); --> Creating child object, or we can mention static in class name
		c.sub();
		c.Parent();
		
		

	}

}


// " The process of acquiring property from one class to another class is called as Inheritance"  Also called as "Extensibility".


/* Without inheritance
class A {
void m1(){}
void m2(){}
}
class B {
void m1(){}
void m2(){}
void m3(){}
void m4(){}
}    ---> Here the length of the application is increased and code is duplicated hence this leads to data redundancy.


To overcome from this disadvantage we are declaring inheritance.

* Main use of inheritance is to decrease the length and redundancy of the application.
* By using "extends" keyword we can give relationship between two classes.

With inheritance:-

class A {  -->Parent[Super or Base class]
void m1(){}
void m2(){}
}
class B extends A { -->Child[Sub or derived class]
void m3(){}
void m4(){}
}

*/


// To prevent inheritance we are using "final keyword"  .... i,e final class Parent(){}----> we are unable to create child

/*
1. Default super class in java 			: Object class
2. Root class in java					: Object class
3. Every class in java child of object class either directly or indirectly.
4. Every class in java contains parent class except object class
5. Object class belongs to "java.lang" package. It contains 11 methods
6. By using "javap java.lang.object" we can list all 11 methods.
7. To prevent inheritance we are using "Final" keyword.
i,e class A{}
    final class B extends A{}
    class C extends B{}  --> error bca here we prevent the class B child creation
*/

/* Types of inheritance :-
 1. Single
 2. Multilevel
 3. Hierarchical
 4. Multiple -->Not supported
 5. Hybrid --> Not supported
 */


//to represent the data of super class we are using "Super" keyword.

