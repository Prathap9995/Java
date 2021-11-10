
public class Method9 {
	int a = 100;				//instance variable
	int m1(int a) {				//loc al variable
		return a;				//Preference to local variable
	}
	int m2() {
		return a;				//preference to instance variable
	}
	int m3(int a) {
		return this.a;			//Return instance variable value
	}
public static void main(String[] args) {
	Method9 m = new Method9();
	int a = m.m1(10);			
	System.out.println(a);		//10 - local
	int b = m.m2();
	System.out.println(b);		//100 -- Instance
	int c = m.m3(20);
	System.out.println(c);		//100 --Instance
}
}
