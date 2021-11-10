//Important 
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To reverse and check it is palindrome or not
  String a = "Prathap";
  String t = "";    //Declaring dummy string
 //By using for loop we are reversinfg the string
  for(int i=a.length()-1; i>=0;i--) {
	  //Then we are getting the each characters
	char s=  a.charAt(i);
	t=t+s; //Concating the each string
  }
  if(t==a) {
	  System.out.println("Palindrome");}
  else {
	  System.out.println("Not Palindrome");
		  
	  }
	  
  
  }
 
	  
  }
  
	


