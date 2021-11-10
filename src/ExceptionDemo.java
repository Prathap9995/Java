
public class ExceptionDemo {

	public static void main(String[] args) {
		//Consider two variables
		int a =7;
		int b=0;
		  
		//So by using try-catch mechanism
		try { //It will try the script to execute if it is failed move to catch block
			int k =a/b;     //Where it will throws an error because of arithmatic exception...here value is infinity 
			System.out.println(k);
		}
		catch(ArithmeticException et) {   //Multiple catch block supports  //Specific exception
			System.out.println("Catched the error");
			
		}
		catch(Exception e) {
			System.out.println("Catched the error");
			
		}
		finally{   //Even script pass or fail it will execute
			System.out.println("Delete cookies and close window");
		}
	}

}


//If the our code throws an error we need catch them and print a message without fail--> called try catch method
//If we introduced try-catch our script will never fails it skips the code and comes to catch block and executes
//One try can be followed by many catch block
//Catch block should be immediate block after try block
//For any kind of errors we are writing like :-catch(Exception e)--->Generic
//For specifically exception  --for example arithmatic exception : catch(ArithmaticException et)

/* Finally :-  This block executes irrespective of exceptions thrown or not (error)
 *It should be written only when we used try block
 * */

