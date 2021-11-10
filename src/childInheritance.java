
public class childInheritance extends InheritanceParent {

	//method overriding
	public  void colour() {    //here we are have the same method in parent also we are overriding the method here
		super.colour();
		System.out.println("Child colour of vehicles");
	}
	
	
	
	public void engine() {
		System.out.println("My own engine property");
	}

	public static void main(String[] args) {
		// deriving the property of parent class
		childInheritance cd = new childInheritance();
		System.out.println(cd.str);
		cd.basicProp();
		cd.colour();       //Method overriding -->Gives child output
		cd.engine(); // child class method
		//Method overloaded 
		cd.getData();
		cd.getData(2);
		cd.getData("Prathap");

	}

	// Method overloading
	public void getData(int a) {   //Here argument count is 1
		System.out.println(a);
	}

    public void getData() {  //Count is 0
    
    }
    public void getData(String b) {  //return type is change
    	System.out.println(b);
    }
}

//Java doesnot allows multiple inheritance

/*
 * Function overloading:- Where a class have multiple method with a same name is
 * called as function overloading Here we are differentiating with argument
 * count different or argument return type should be different
 * Ruless were :-   Argument count should be different or argument type should be different
 */


/*  
 * Method overriding:-
 * Here we have same method signature and parameter also same from different class*/
