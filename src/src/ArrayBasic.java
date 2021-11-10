
public class ArrayBasic {
	public static void main(String[] args) {
		  int []values= new int[100]; 	//initialization of array
		  values[0]= 10;				//Assigning the values to particular index position
		  values[10]=100;
		  values[99]=1000;
		  System.out.println(values[0]);
			
		  System.out.println(values[40]);
		  System.out.println(values.length);
		  String [] array=new String[] {"My", "name", "is"};  //Another type declaration
		  System.out.println(array[0]);
		  
		  array = new String[10];
		  System.out.println(array[0]);	//Null --->We have to set brand new values
	}


}
