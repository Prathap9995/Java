
public class Method1 {
	void m1(int a, String str) //passing parameters --> always local variable
	{  //instance method
		 System.out.println("m1 method");
		 System.out.println(a);
		 System.out.println(str);
	 }
static void m2(char ch, double d) // passing parameters
{  //Static method
	 System.out.println("m2 method");
	 System.out.println(ch);
	 System.out.println(d);
}
 public static void main(String[] args) 
 {  //Static method
	 Method1 m = new Method1();
	m.m1(5, "Prathap");  // passing parameters values --> the number of parameters should match
	Method1.m2('c', 10 ); 
}}


//passing parameter in methods --> primitive parameters8