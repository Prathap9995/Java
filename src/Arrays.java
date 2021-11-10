
public class Arrays {

	public static void main(String[] args) {
	/*	int a[]= new int[5]; //declaring and creating memory for the array
		a[0]=5;
		a[1]=8;
		a[2]=3;
		a[3]= 3;  //Initializing the values for index
		a[4]=5;
				*/
     int a[] = {0,4,6,7,8};  // We can declare a array in this type also  -->we are directly passing the value and not creating memory
for(int i=0;i<a.length; i++) {
	System.out.println(a[i]);    //Retrieving the array value
}
	}

}


//A container which store multiple values of same data type