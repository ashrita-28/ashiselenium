package exceptionhandling;

public class ThrowsAndThrowKeyword {

	public static void main(String[] args) {
		
		sum(10,20);
		temp();
		pause(1000);
	}
	
		
	
	public static void pause(long miliseconds) throws InterruptedException
	{
		Thread.sleep(miliseconds);
	}
	
	public static void sum(int a, int b) throws ArithmeticException
	{
		System.out.println(a+b);
	}
	

	
		
	}




