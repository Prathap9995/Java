
public class Method3 {
void m1() {
	System.out.println("Prathap");
	
	//void m1(){} --> Not valid because same method signature
	
} void m1(int a) // Valid different method signature
{
	System.out.println("Barkur");
	System.out.println(a);
}
public static void main(String[] args) {
	Method3 m = new Method3();
	m.m1();
	m.m1(5);
}
}
