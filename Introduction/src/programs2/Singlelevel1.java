package programs2;

public class Singlelevel1 extends Singlelevel {
	int bikes = 0;

	public void sonestate() {
		System.out.println("Son's bike is:" + bikes);
	}

	public static void main(String[] args) {

		Singlelevel1 s1  = new Singlelevel1();
		
		s1.estate();
		
		System.out.println("---------------------------");
		
		s1.sonestate();
		
		System.out.println("---------------------------");
		
		Singlelevel s2  = new Singlelevel();
		
		s2.estate();
		
		
		
		
	}
}
