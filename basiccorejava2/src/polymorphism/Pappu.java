package polymorphism;

public class Pappu {

	public static void main(String[] args) {
		
		Object obj;
		obj=new Smartphones();
		obj=new Telephone();
		obj=new Mobile();
		
		Smartphones phone= new Smartphones();
		phone.calling();
		
		Telephone phone2= new Telephone();
		phone2.calling();
	
		Mobile phone3= new Mobile();
		phone3.calling();
	
		phone= new Smartphones();
		
		
		phone2= new Smartphones();
		phone2= new Telephone();
		phone2= new Mobile();
			
		Object obj= new Telephone();
		obj= new Mobile();
		obj= new Smartphones();
		
		

		
		
		
		
	}
	
		

	}





