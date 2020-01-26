package polymorphism;

public class Pappu2
{
	public static void main(String[] args) {

		Telephone phone=new Smartphones();
		phone.calling();
		// dynamic polymorphism 
		
		
		
		phone=new Mobile();
		phone.calling();
		
		phone=new Telephone();
		phone.calling();
		
		
}
}