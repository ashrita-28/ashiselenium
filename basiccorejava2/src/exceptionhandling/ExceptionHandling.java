package exceptionhandling;

import java.rmi.AccessException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			
		//example 1 - ArithamaticException
		System.out.println(a/b);
		}
		catch(AccessException e)
		{
			System.out.println(e.getMessage());
		}
		try {
		//Example 2 - StringIndexOutOfBoundsException
		
		String name="anand";
		System.out.println(name.charAt(10));
		}catch(StringIndexOutOFBOundsException e)
	
	}
	
}


