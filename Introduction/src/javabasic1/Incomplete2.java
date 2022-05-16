package javabasic1;

public class Incomplete2  extends Incomplete1
{

	@Override
	void sample() {
		System.out.println("main method is running..");
		
	}
	
	public static void main(String[] args) {
		
		Incomplete2 i2  = new Incomplete2();
		
		i2.sample();
		i2.test();
		
	
	}

}
