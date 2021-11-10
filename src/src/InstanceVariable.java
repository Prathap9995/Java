
public class InstanceVariable {
	int a =10;
	public static void main(String[] args) {  // static area
		InstanceVariable t = new InstanceVariable();//creating object
		System.out.println(t.a);
		m1();//call directly same area
		t.p1();//call by object different area
	}
static void m1() { //static area
	InstanceVariable m= new InstanceVariable();//creating object
 
	

	System.out.println(m.a);

} void p1() {
	System.out.println(a);//call directly same area i.e instance area
}}
