
public class SuperStatic {
	{
		System.out.println("Parent ins block");
		}
	 SuperStatic()
	 {
		 System.out.println("Parent cons");
	 }
	static
	{
		System.out.println("Prathap");
	}
	
static class Child extends SuperStatic {
	static
	{
		System.out.println("Shwetha");
	}
	{
		System.out.println("Child ins block");
		}
	Child()
	{
		
	//super() compiler will generate by default hence at first parent class will execute then child class
		System.out.println("Child cons");
	}
}

	public static void main(String[] args) {
	new Child();

	}

}


//Static block will execute during class loading so it will execute only once