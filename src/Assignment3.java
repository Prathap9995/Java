
public class Assignment3 {

	public static void main(String[] args) {  //Pyramid in reverse order
	
		for(int i =0; i<4;i++) {  //Outer loop==> By using nested loops
			
			for(int j=0; j<=i; j++) {   //Inner loop here we are increment one number to get desired output
				
				System.out.print(j);    //if we use print only then they wont execute in separate line
				System.out.print("\t");   //To give spaces btn digits
				
				
				
			}
			System.out.println("");    //Once inner loop executes it will prints in new line
 		}
	}

}
