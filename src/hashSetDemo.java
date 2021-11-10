import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {

	public static void main(String[] args) {
		//Creating hashset object
		HashSet<String> hs = new HashSet<String>();
		hs.add("UK");
		hs.add("USA");
		hs.add("UAE");
		hs.add("UAE");  //rejects this value becz duplicate not allowas here
		hs.add("India");
		System.out.println(hs);
		hs.remove("UK");
		hs.size();
		hs.isEmpty();
		System.out.println(hs);
		hs.add("Google");
	
		
		//Iterator
	Iterator<String> it =hs.iterator();
	System.out.println(it.next());
	System.out.println(it.next());
	//If we have multiple elements then to print
while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}



//Hashset, treeset, LinkedHashset implements set interfaces  
//Difference btn list and set is...here set interface does not allows duplicate values
//There is no guarantee elements will store in sequential order....may store in random order
//Here we are unable to get indexes because it will set in randomly

/*Iterator :- to traverse each and every object in the set*/