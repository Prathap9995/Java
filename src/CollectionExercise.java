import java.util.ArrayList;

public class CollectionExercise {
//Interview question
	public static void main(String[] args) {
		//declaring a array
		int a[] = {3,3,3,4,4,6,6,5,5,3,7};
		//Creating a arraylist to store the checked values
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//using for loop checks for every element
		for(int i=0;i<a.length;i++) {
			int k=0; // Declare a variable
			if(!arr.contains(a[i])) {    //==>here where condition is false hence introducing negotion 
				arr.add(a[i]);
				k++;
				
				for(int j=i+1; j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
			System.out.println(a[i]+  "The number");
			System.out.println(k+ " count of repeat");
			
			if(k==1) {
				System.out.println(a[i]+ "is unique number");
			}
			
			}
		}

	}

}
