
public class MultiArray {

	public static void main(String[] args) {
	/*	int a[][]= new int[2][3];   //Static array-->Because size is fixed
		a[0][0]=9;
		a[0][1]=2;
		a[0][2]=4;
		a[1][0]=8;
		a[1][1]=3;
		a[1][2]=6; */
		
		int b[][]= {{4,3,6},{3,5,7}};    //b[row][column]
				
		System.out.println(b[0][2]);    //6 is output
		//To print all the data
		for(int i=0; i<b.length;i++) {   //for row  -->Where b.length will gives row length
			for(int j=0; j<b[0].length;j++) {  //for column --> Where b[0].length will give column count
			
			System.out.println(b[i][j]);
			System.out.println(b.length);
			System.out.println(b[1].length);
		}
	}

}}


//Inn multidimensional array:- passing an array with multi dimensionally