package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String[][] data= new String[4][2];
		
		//row 1
		data[0][0]="Username";
		data[0][1]="Password";
 
		 //row 2
		 data[1][0]="Username1";
		 data[1][1]="Password1";
		 
		 //row3
		 data[2][0]="Username2";
		 data[2][1]="Password2";
		 
		 //row 4
		 data[3][0]="Username3";
		 data[3][1]="Password3";
		 
		 for(int row=0; row<4; row++)
		 {
			 for(int col=0; col<2; col++)
			 {
				 System.out.println(data[row][col]);
			 }
		 }
		/*
		 * for(int row=0; row<data.length; row++) { for(int col=0; col<data[row].length;
		 * col++) { System.out.println(data[row][col]); } }
		 */
	}

}
