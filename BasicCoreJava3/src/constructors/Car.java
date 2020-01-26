package constructors;

public class Car 
{
	String color;
	String brand;
	String type;
	
	static int wheels=4;

	public void features()
	{
		System.out.println("I purchesed "+color+" "+brand+" car which has "+type+" engine and has "+wheels+" wheels");
	}
	//Default Constructor
	public Car()
	{
		
	}



//Parameterized Constructors
	//this keyword is point to instance variable

public Car(String color ,String brand, String type)
{
	this.color=color;
	this.brand=brand;
	this.type=type;
	}
	
}