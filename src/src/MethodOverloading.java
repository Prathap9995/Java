
public class MethodOverloading {

	//method overloading
	void m1(int a) {
		System.out.println("Int value is :- " +a);
	}
	void m1(int a, int b) {
		System.out.println("Int value is :- " +a+ " " +b);
	}
	void m1(char ch) {
		System.out.println("char value is :- " +ch);
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.m1(10);
		m.m1(10,20);
		m.m1('a');

	}

}


//Here class contains same method name and different number of argument and same number of arguments with different data types.