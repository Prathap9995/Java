
public class Constructor1 {
	int empid =11;
	String ename;
	float esal;
	int id;
	String name;
	
	// By using user defined constructor,.. it will executes during object creation
	
	Constructor1(int id, String n, float s){  //User defined---> parameterized constructor---> recommended-->{local variable}
		this.empid = id;  //Here we are converting local variable to instance variable to access the value throughout application
		ename = n;
		esal = s;
	}
	Constructor1(int id, String name){ //Here we have local and instance variable name same hence by using this keyword we are converting values
		this.id = id;
		this.name = name;
	}
	Constructor1(){  //User defined constructor -->zero argument constructor
		empid = 02;
		ename = "Shwetha";
		esal = 1000;
	}
	 void m1() {
		 System.out.println("id -"+empid);
		 System.out.println("name -"+ename);
		 System.out.println("sal -"+esal);
		 System.out.println("id -"+id);
		 System.out.println("name -"+name); 
	 }
public static void main(String[] args) {
Constructor1 c = new Constructor1(10, "Prathap", 1000);
Constructor1 c1 = new Constructor1();
Constructor1 c2 = new Constructor1(); //Here default constructor will not generate bcz we declared constructors
Constructor1 c3 = new Constructor1(10, "Prathap");
    c.m1();
	c1.m1();
	c2.m1();
	c3.m1();
	}

}








/* If we not define constructor here, the default value of the variable will be executed
i,e :- id -0
name -null
sal -0.0    */
 //to overcome from this problem we have to declare constructor
//Scope of the variable is inside class,constructor only