import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Declaring an arraylist
		ArrayList<String> a = new ArrayList<String>();
		//Adding elements to the array
		a.add("Prathap");
		a.add("Shwetha");
		a.add("Shwetha");   //We cn add duplicates
		//printing the array value
		System.out.println(a);
		//Adding the value in required index
		a.add(0, "Java");
		System.out.println(a);
		//To delete the data by index
		a.remove(0);    
		a.remove("Prathap");
	
		System.out.println(a);
		
		a.add("Prathap");
		a.add("Java");
		//To get the value by index
		System.out.println(a.get(2));
		//To check whether that string is present or not
		System.out.println(a.contains("Korathi"));
		
		//To know the index of specific string
		System.out.println(a.indexOf("Shwetha"));
		//To know empty or not
		System.out.println(a.isEmpty());
		//To know the size
		System.out.println(a.size());
	
	}

}

//It has more flexibility than array....hence everone using arraylist only
//It accepts duplicate values
//Implementing list interfaces ---ArrayList, Linked list,vector

/*Difference btn array and array list
 * Array have fixed size but list can grow dynamically
 * We can access and insert any value in any index --> but not in array
 * */
