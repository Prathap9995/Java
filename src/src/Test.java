
public class Test {
	int num = 100;    //instance variable
	String name = "Prathap";
	static void  m1() {  //static area
		Test t = new Test();
		System.out.println("The num is" +t.num+ "Name is"+t.name);
		
	}
	static void m2() { //static area
		Test s = new Test();
		System.out.println("The num is" +s.num+ "Name is"+s.name);
	}
	public static void main(String[] args) {
		Test m = new Test();
		Test.m1();  //Here we can call by class name because it is a static area and static area
		Test.m2();    
		m.m3();  //It is from instance area hence we have to create object and call by its name
	}
	void m3() {
		System.out.println("The num is" +num+ "Name is"+name);
	}

}
