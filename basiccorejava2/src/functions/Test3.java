package functions;

public class Test3 {

	public static void main(String[] args) {
		
		System.out.println(message("ashrita", 23));
		System.out.println(message("ashrita", 23,true));
		
		}
			
		
		public static String message(String name) {
				return "your name is " +name;
				
	
			}
		
		public static String message(String name, int age, boolean maritalStatus) {
			if(marritaStatus=true)
			{
				return "your name is " +name+ " and your age is " +age" and you are married";
				else
					return "your name is " +name+ " and your age is " +" "and you are unmarried";
			}
			
			
			
		}
	}


