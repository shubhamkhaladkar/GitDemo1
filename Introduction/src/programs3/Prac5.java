package programs3;

public class Prac5 {
	public static void main(String[] args) {
		System.out.println("Main method is started");
		int lines = 5;

		int starcount = 5;

		for (int i = 1; i <= lines; i++) 
		{
			for (int j = 1; j <= starcount; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			starcount--;
		}
		System.out.println("Main method is ended..");
	}
}
