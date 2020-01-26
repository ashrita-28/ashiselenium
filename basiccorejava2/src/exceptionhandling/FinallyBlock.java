package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
	try {
		System.out.println(10/0);
		
	}catch(Exception e)
	{
	}
		finally{
			System.out.println("finally block");
		}
	
	}

}

