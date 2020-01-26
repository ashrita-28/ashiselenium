package stringclass;

public class StringClassCommonFunctions {

	public static void main(String[] args) {
		
		String name=" Ashrita ";
		
		//function 1 - Length
		//System.out.println(name.length());
		
		
		//Function 2 - Trim
		
		
		System.out.println(name.trim().length());
		
		
		//Function 3 - charAt
		
		System.out.println(name.charAt(0));
		
		
		//Function 4 - toUperCase
		
		System.out.println(name.toUpperCase());
		
		
		//Function 5 - toLowerCase
		
		System.out.println(name.toLowerCase());
		

		//Function 6 - Substring
		
		System.out.println(name.substring(1));
		
		
		//Function 7 - substring
		
		System.out.println(name.subSequence(1, 9));
		
		//Function 8 - Replace
		
		System.out.println(name.replace("a","m"));
		
		//Function 9 - Split
		
		//String[] arr=name.split("s");
		
		//for(String s:arr)
		{
			//System.out.println(s);
		}
		
		
		//Function 10 - 
		System.out.println(name.equals("ashrita"));
		
		System.out.println(name.contains(name));
		
		
		//test
		
		String[] arr=name.split("a");
		for(String a:arr)
		{
			System.out.println(a);
		}
				
		
		
		//System.out.println(name.concat(name));
		
			
		
		// que: anand find the number of n in string anand
		
		
	
		
	}

}
 