
public class Assignmentarray {
	// 3*3 mulutidimensional array -- matrix---Inetrview

	public static void main(String[] args) {
		int abc[][] = { { 4, 3, 5 }, { 5, 6, 7 }, { 1, 4, 2 } };
		// To traverse all the number
		// Assume our first index will be the minimum value then
		int min = abc[0][0];
		int minimumcolumn = 0;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) { // Comparing all the value
					min = abc[i][j]; // replacing with minimum values
				//To find column of the minimum nu,mber--Where i refers row and j refers column
				minimumcolumn = j;    //Column
					}
			}

		}
		System.out.println(min);    //Minuimum value
		//Declaring a variable
		int max = abc[0][minimumcolumn];
		int k = 0;
		while(k<3) {  //Where column values is 3
			if(abc[k][minimumcolumn]>max) {  //Comparing the maximum value for the column
				max=abc[k][minimumcolumn];
				
			}
			k++;
		}
		  
		System.out.println(max);    //Maximum value of the column
	}

}



//To find the maximum number in a column  wherever you got the minimum number
//Step 1 - First find minimum value
//Indentify the perticular column
//Find the maximum number of the identified column
