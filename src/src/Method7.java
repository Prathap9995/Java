
public class Method7 {
	int m1() {
		System.out.println("Prathap");
		return 10;
		
	}
	static float m2() {
		System.out.println("barkur");
		return 20f;			// by default it is double hence we are adding "f"
	}
	char m3() {
		System.out.println("Prathap");
		return 'c';
	}
	public static void main(String[] args) {
		Method7 m = new Method7();
		m.m1(); 					// Prathap --> m1() output
		int a = m.m1();			//We have to declare the value to get return value
		System.out.println(a); 		// 10--.>
		//float b = Method7.m2();		// Call by class name --> declare return value
		
		m.m3();   // Prathap --> because we didn't declare the return type value
	
	}

}
