package programs;
//multiple inheritance by interface
public interface Test49 
{
  void brand (String company);
  void price (double  amt);
}
interface Test50
{
  void brand1 (String company);
  
  void display(String type);
}

class shubham implements Test49, Test50
{

	@Override
	public void brand(String company) 
	{
	  System.out.println("Company name is:"+company);	
		
	}
	
	@Override
	public void price(double amt)
	{
		System.out.println("Amount is:"+amt);
	}
	
	@Override
	public void brand1(String company) 
	{
	  System.out.println("Company name is:"+company);	
		
	}
	
	
	@Override
	public void display(String type)
	{
		System.out.println("Display type is:"+type);
	}
	
}