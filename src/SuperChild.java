
public class SuperChild extends SuperDemo{
	
	String name = "shwetha";

	public void getData() {
		System.out.println(name);
		System.out.println(super.name);	//refers super class variable
	}
	
	 public void newData() {
		 //To print super class newdata method 
		 super.newData();
		 System.out.println("I child class");
	 }
	//Using constructors
	 public SuperChild() {
		 super();    //It should be walways be first line
		 System.out.println("Child Constructors");
		
	 }
	
	public static void main(String[] args) {
		
	SuperChild Sd = new SuperChild();
	Sd.getData();
Sd.newData();
	}

}



//Preferance given to local variable only
//Super keyword will refers to super or parent class
//Used when the same variable or method described in parent and child class then we are declaring super to achieve aour goal