import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Workouts {

	public static  void main(String[] args) {
		int k=1;
		for(int x=1; x<=5; x++) {
			for (int y=1; y<=x;y++) {
				System.out.print(k+" ");
				k++;
				
			}
			System.out.println(" ");
			
		}
		
int a=0, b=1, c;
for(int i =2; i<=10;i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.print(c+" ");
}

String str = "Prathap";
String dummy = "";
for(int i=str.length()-1; i>=0;i--) {
	char c1 =str.charAt(i);
	dummy = dummy+c1;
	}

	System.out.println(dummy);
	
	
	int arr[]= {10, 20, 30, 40, 50};
	int val = arr[0];
	
	
	for(int i=0;i<=arr.length;i++) {
		try {
		if(arr[i]> val) 
			val=arr[i];}
		catch(Exception e){
			System.out.println("Error");
		}
		}
			System.out.println(val);
			
	
	
	;
	for(int i=0; i<=5;i++)
	{
		int l =i %2;
		if(l==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not");
		}
	}
	
	String r = "google";
	int count=0;
char newar[] = r.toCharArray();
for(int i=0; i<r.length(); i++) {
	for(int j =i+1; j<r.length(); j++) {
		
	
	if(newar[i]==newar[j])  {
		System.out.print(newar[j]);
		count++;
		
	}
		
		
	}
}

String strs = "Prathap";
StringBuffer stb = new StringBuffer();
stb.append(strs);
stb.reverse();
System.out.println(stb);


HashMap<String, Integer> map =  new HashMap<String, Integer>();
map.put("Prathap", 0);

Set s = map.entrySet();
Iterator sit = s.iterator();
while(sit.hasNext()){
Map.Entry me = (Map.Entry) sit.next();
me.getKey();
me.getValue();
	
}


	}}	


