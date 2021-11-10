
public class Method5 {
	
	int x = 100;   //instance variable
	 int y = 200;
	 int a=20;
	int b =30;
  void add(int x, int y)//local variable
	{
		System.out.println(x+y);  //Here it gives preference to local variable an executes local variable only
		System.out.println(x+y);  //Both local and non local have same name
		System.out.println(a+b);
		System.out.println(this.x+this.y); //to get instance variable value
	}
	public static void main(String[] args) {
		// Method5 m = new Method5();
		new Method5().add(10,20);
		
	}

}



//If our application have local an non local variable with same name it is always gives priority to local only.
//In this case to get the value of instance variable use "this" keyword
/* In java inside the static area "this" keyword is not allowed
i.e, 
static void add(int x, int y)//local variable
{
System.out.println(x+y);  //Here it gives preference to local variable an executes local variable only
System.out.println(x+y);  //Both local and non local have same name
System.out.println(a+b);
System.out.println(this.x+this.y); //to get instance variable value
}   */