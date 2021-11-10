
public class Variables {
	String name;
	String Address;
	static String city;
	static int i =0;
	int j=0;
	
	static {
		String ex ="Example"; 
		int p=0;
	}
	
	public Variables(String name, String add) {
		this.name = name;   //Both local and instance variable have same name hence by usng this we are assigning the value of instance
		Address=add;
		Variables.city = "Bangalore"; //Assigning the value here -->We shouldnit use this in static
		i++;
		System.out.println(i);   //static values
		j++;
		System.out.println(j);   //instance value
	}
	
	public void getData() {
		System.out.println(Address+" " +city);  //Access the values of address and city
	}
	
	public static void getCity() {   //Static method --called as class method
		System.out.println(city);
	}

	public static void main(String[] args) {
		Variables var = new Variables("Prathap", "Barkur");
		Variables var1 = new Variables("Shwetha", "Barkur");
var.getData();
var1.getData();
Variables.getCity();   //call by class name


	}

}



/*The variables declared inside class but outside method is called instance var
Memory allocation happens when object is created...i,e value will change object to object

*/
/* all static variables are static variables --->with keyword static
 * In static we should not use this keyword
 * it will share the value globally
 * Static method will only allowed static variable
 * */
 

//Static block:- is used to declare all the static variables