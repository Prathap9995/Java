
public class ThisDemo {
int a = 3;

public void demo(int a) {    
	
	System.out.println(a);
	System.out.println(this.a);
	//to sum of both local and global variable
	int b = a+this.a;
	System.out.println(b);
	
}
	public static void main(String[] args) {
		

		
ThisDemo t = new ThisDemo();
t.demo(7);
	}

}


//This refers to current object and object scope lies in class level
///To prints the global variable