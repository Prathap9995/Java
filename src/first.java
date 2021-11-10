
public class first {

	public static void main(String[] args) {
		System.out.println("Prathap");     //Here ;ln stands for new line-->if we write print only it will continues in single line
   //String
		String a = "java training";     //String literal
		String ab = new String("Hi");  //By object creation
		//If we want any characters by index   :- index strts from 0
	System.out.println(	a.charAt(3));
	//in which index one character is predent
	System.out.println(	a.indexOf("e"));
	//pull the substring
	System.out.println(	a.substring(4, 9));
	//Starts from 5th
	System.out.println(	a.substring(5));
	//To concat
	System.out.println(a.concat("Prathap"));
	//length
	System.out.println(a.length());
	//To remove wide space
	System.out.println(a.trim());
	//To split
	String[] arr = a.split(" ");  //Here we have to store it in array
	System.out.println(arr[0]);
	
	//To replace
	a.replace("i", "g"); 
	
	
	}

}



//Objects are instances of the classes
//String is one of prebuilt class in java
/*String is a prebuilt class in java
we can define it in two ways

* String literal  :- if there duplicate data it will referes the datas --In backend it will take care of all the things
*  By creating object :- If any duplicates it will again create on more object-->bcz here we are explicitly forcing to create
* a.indexOf("e") ---prints -1 bcz there is no such element


*/
