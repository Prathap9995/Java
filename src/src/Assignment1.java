
public class Assignment1 {
	int num = 100;    //instance variable
	String name = "Prathap";
	static void  m1() {  //static area
		Assignment1 t = new Assignment1();
		System.out.println("The num is "  +t.num+ " Name is "+new Assignment1().name);
		
	}
	static void m2() { //static area
		Assignment1 s = new Assignment1();
		System.out.println("The num is " +s.num+ " Name is "+s.name);
	}
	public static void main(String[] args) {
		Assignment1 m = new Assignment1();
		Assignment1.m1();  //Here we can call by class name because it is a static area and static area
		Assignment1.m2();    
		m.m3();  //It is from instance area hence we have to create object and call by its name
	new Assignment1().m3();
	}
	void m3() {
		System.out.println("The num is " +num+ " Name is "+name);
	}

}
