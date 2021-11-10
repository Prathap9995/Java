
public class Constructors {
	//Zero argument constructor
	public Constructors() {     //It is not wants any return type
		System.out.println("Hey Its zero argument constructor");   //This code will executes only when object is created
	}
	//Parameterized constructors
	
	public Constructors(int a, String b) {
		System.out.println("Hey its parameterized constructors");
	}
	
	
	
	public void dummy() {
		System.out.println("Dummy");
	}

	public static void main(String[] args) {
		Constructors cd = new Constructors();   //Zero argument will only executes
		Constructors Con = new Constructors(3,"Prathap");   //prints parameterized constructors

	}

}


//It executes a block of codes whenever a object is created
//Constructor will not return any values
//name of the constructor should be always class name
//Compiler will call default or implicit constructor if we not define any constructor block
//In general we used to define variable or some property