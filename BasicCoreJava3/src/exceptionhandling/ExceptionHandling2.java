package exceptionhandling;

import inheritance.Smartphones;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		try {
		//example 1 - ArithamaticException
		
		System.out.println(a/b);
		
		
		//Example 2 - StringIndexOutOfBoundsException
		
		String name="anand";
		System.out.println(name.charAt(2));
		
		//example 3 -ArrayIndexOutOfBoundsException
		
		String[] arr=name.split("n");
		System.out.println(arr[4]);
		
		//exapmle 4 - NullPointerException
		
		Smartphones phone=null;
		phone.calling();
	}catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());
	}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	
	}

}
