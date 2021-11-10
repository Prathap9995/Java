
public class StaticBlock {
	{ 
		System.out.println("Prathap");
	}
	{
		System.out.println("Shwetha");
		}
	public StaticBlock(int a) {
		System.out.println("Constructor-1");
	}
	static { 
		System.out.println("Static");
	}
	static {
		System.out.println("Static 1");
	}
	public StaticBlock() {
		System.out.println("Constructor-2");
	}

	public static void main(String[] args) {
		new StaticBlock();
		 new StaticBlock(10);
		 new StaticBlock();
		
	}

}

// used to write business logics
// During .class file loading it is executing, hence we can call without main method. But after 1.6 version it is manadatory to declare main method
// It is executes only once because it is depends on .class file loading
