
public class Constructor {
 
 /* Test(){
  // empty implementation    --> It is a zero argument constructor called as default constructor
}
  */
 void m1(int a, char ch){
	 System.out.println(a+ " " +ch);
	 System.out.println(ch);
 }

	public static void main(String[] args) {
		Constructor t = new Constructor();//Constructor part
		Constructor t1 = new Constructor();
		t.m1(10, 'b');
		
		
		
	}

}












/*Rules :-
//* Cust name shoul match same as class name
//* In cust return type not allowed
//*It should able to allows parameters
*/

// In a project if we didn't declare a single constructor then compiler generates a zero argument constructor called as default constructor 
