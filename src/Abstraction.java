
public abstract class Abstraction {

	public void Rules() {
		System.out.println("Airspace rules");
		 }
	
	public void engine() {
		System.out.println("Aeroplane engine rules");
	}
	public abstract void color();    //Abstract method

}


//Abstraction is process of hiding the implementations from the user
//Class which is declared with abstract keyword is abstract class
//If a class have implemented methods and non implemented methods[withoud body] that class we are calling as abstract class 
//Where if any method in a class does not have body then it is called as abstract method.....Same as interface
//But in interface all the methods are abstract

//We cannot have private access modifier in abstact class


/* Interfaces vs Abstraction 
 * Interface ---all should be abstract 
 * ---->Access modifiesrs should be public
 * ---->Variables should be declared as public
 * ---->To implements the method used a keyword "implements"
 * 
 * Abstraction ------
 * We can have both abstract and non abstract methods
 * Except private we can have any other access modifiers
 * Except private variables can have any access specifiers
 * to implements we are using extend keyword 
 * */
