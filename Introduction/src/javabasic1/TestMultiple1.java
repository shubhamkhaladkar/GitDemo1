package javabasic1;

public class TestMultiple1  implements Multiple1, Multiple2
{

	@Override
	public void price(double p) {
		System.out.println("Price is:"+p);
		
	}

	@Override
	public void displays(String str) {
		System.out.println("Display is:"+str);
		
	}

	@Override
	public void name(String str) {
		System.out.println("name is :"+str);
		
	}

	@Override
	public void names(String str) {
		System.out.println("names is: "+str);
		
	}
	
	public static void main(String[] args) {
		TestMultiple1 t1  = new TestMultiple1();
		
		t1.displays("4K");
		t1.names("Samsung");
		t1.name("Apple");
		t1.price(60000.00);
		
		
		
	}
 
}
