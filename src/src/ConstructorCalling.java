
public class ConstructorCalling {
	int id =20;

	public ConstructorCalling() {
		this(10);
	
		System.out.println("Prathap");
		
	}
	public ConstructorCalling(int id) {
		this.id=id;
		System.out.println("Shwetha");
	}
	public ConstructorCalling(int id, int b) {
		
		System.out.println("Poojary");
	}
	void m1() {
		System.out.println("Value is : "+id );
	}
	public static void main(String[] args) {
		
		//named approach
		ConstructorCalling c = new ConstructorCalling();
		ConstructorCalling c1 = new ConstructorCalling(10);
		ConstructorCalling c2 = new ConstructorCalling(10,20);
		//nameless approach
		new ConstructorCalling();
		new ConstructorCalling(10).m1();
		new ConstructorCalling(10,20).m1();
		new ConstructorCalling(16).m1();
	}

}
