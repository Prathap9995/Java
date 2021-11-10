
public class Assignment2 {
//Pyramid
	public static void main(String[] args) {
		//Declare a variable to keepon incrementing
		int k = 1;
		for(int i =0; i<4;i++) {  //Outer loop==> By using nested loops
			for(int j=0; j<4-i; j++) {   //Inner loop here we are decrementing one number to get desired output
				System.out.print(k);    //if we use print only then they wont execute in separate line
				System.out.print("\t");   //To give spaces btn digits
				k++;
				
				
			}
			System.out.println("");    //Once inner loop executes it will prints in new line
 		}
	}

}
