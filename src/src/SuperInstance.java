
public class SuperInstance {
	 {
		System.out.println("Parent ins block");
		}
	 SuperInstance()
	 {
		 System.out.println("Parent cons");
	 }
	static class Child extends SuperInstance{
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



//Instance blocks are executed during object creation, at first parent class will executed