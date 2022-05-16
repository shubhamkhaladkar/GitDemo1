package programs;

public class Test25
{
 //single level inheritance
	
	int house = 2;
	
	int car = 1;
	
	double cash =50.0;
	
	public void fatherproperty()
	{
		System.out.println("father's  property: ");
		
		System.out.println("Hosue:"+house);
		
		System.out.println("Car:"+car);
		
		System.out.println("Cash:"+cash);
	}
	
	
}

class Son extends Test25
{
	int bike = 1;
	
	public void sonproperty()
	{
		System.out.println("Son's property: ");
		System.out.println("Bike:"+bike);
	}
}