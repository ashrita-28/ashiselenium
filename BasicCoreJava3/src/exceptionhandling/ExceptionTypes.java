package exceptionhandling;

import inheritance.Smartphones;

public class ExceptionTypes {

	public static void main(String[] args) throws InterruptedException {
		int a=10;
		int b=0;
		
		//example 1 - ArithamaticException
		
		System.out.println(a/b);
		
		
		//Example 2 - StringIndexOutOfBoundsException
		
		String name="anand";
		//System.out.println(name.charAt(10));
		
		//example 3 -ArrayIndexOutOfBoundsException
		
		String[] arr=name.split("n");
		//System.out.println(arr[4]);
		
		//exapmle 4 - NullPointerException
		
		Smartphones phone=null;
		//phone.calling();
		
		//exapmle 5 - InterruptedException
		System.out.println("anand");
		Thread.sleep(5000);
		//System.out.println("Techbodhi");
		
		//example 6 - filenotfoundexception
		//FileInputStream file = new FileInputStream("")
				
				
		//checked exception example 5 & 6
		// unchecked exception - exaple 1-4
	}

}









