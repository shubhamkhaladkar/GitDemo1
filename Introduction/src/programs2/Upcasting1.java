package programs2;

public class Upcasting1 extends Upcasting
{
	@Override
	public void sample()
	{
		System.out.println("Sample method is running..");
	}
	
	@Override
	public void sample1()
	{
		System.out.println("Sample1 method is running..");
	}
	
	public void test1()
	{
		System.out.println("Test1 method is running..");
	}
	
	public static void main(String[] args) {
		
	Upcasting	u1 = new Upcasting1();
	
	u1.sample();
	u1.sample1();
	
	}

}
