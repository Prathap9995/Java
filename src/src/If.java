
public class If {
	int a=20;
	public static void main(String[] args) {
		If t = new If();{
		if(t.a==20) {
			t.a++;
			System.out.println("true" +t.a);
			++t.a;
			
			System.out.println(t.a);
		}else if(t.a!=10+10) {
			 System.out.println("False false");
		}else 
		{
			System.out.println("False");
		}
	}

	

}}


// In java where 0 = false, 1 = true is a invalid condition. It shows compilation error
// we can pass directly boolean value(true or false)