package programs;

public class Test21 {
	
	//displaying exception in console
	public static void main(String[] args) {

		try {
			Class.forName("Test20");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
