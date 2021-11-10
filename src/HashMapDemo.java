import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();  //Here it takes two argument one is for index another is for value
         hm.put(0, "Prathap");     //To add the value here we are using put method
         hm.put(1, "Hello");
         hm.put(2, "Good");
         hm.put(3, "Morning");
         
         
         //To get value
      System.out.println(hm.get(2));
      //to remove
      hm.remove(1);
      System.out.println(hm.get(1));
      
      //entry set  -->converst hashmap into set-->store datas like set index
    Set s =  hm.entrySet();
    //By using iterator
   Iterator it = s.iterator();
   while(it.hasNext()) {
	   Map.Entry value =(Map.Entry)it.next();     //To get only value except key value casting with map
	System.out.println(value.getKey());    //To get the key value
	System.out.println(value.getValue());  //To get value
	
   }
	//HashTable
	Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	ht.put(0, "Prathap");     //To add the value here we are using put method
    ht.put(1, "Hello");
    ht.put(2, "Good");
    ht.put(3, "Morning");
    System.out.println(ht.get(0));
 
      
	}

}


//Takes the in the form of key value
//It requires index value also

//When we implements entryset ==>The each key and value stored in set index


/* Differance btn HashMap and Hashtable
 * HashMap is not synchronized and not thread safe--where hashtable is thread safe and synchronized[i,e where hashtable waits to complete a program and after that it executes next
 * Hashmap allows null values, but in hashtable not allows null values
 * Hashmap objects are iterated by iterator,but in hashtable we use enumerated[in vector also we use enumerated]
 */