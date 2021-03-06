package programs2;

public class FlowofBlockandConstructor {

	void sample1() {
		System.out.println("Sample method is started..");
	}

	static {
		System.out.println("Static block started..");
	}

	{
		System.out.println("Non static block started..");
	}

	FlowofBlockandConstructor() {
		System.out.println("Constructor is started..");
	}

	public static void main(String[] args) {

		System.out.println("Main method started..");

		FlowofBlockandConstructor f = new FlowofBlockandConstructor();
		
		f.sample1();

		System.out.println("--------");

		System.out.println("Main method ended..");
	}
}
