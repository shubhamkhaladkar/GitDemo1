package programs3;

public class Program11 {
	public static void main(String[] args) {

		System.out.println("Main method ended");

		int lines = 10;

		int starcount = 9;

		int spacecount = 0;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spacecount; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= starcount; k++) {
				if (i % 2 != 0) {
					System.out.print("*");
				}
			}
			System.out.println();
			starcount--;
			spacecount++;
		}
		System.out.println("Main method ended");
	}
}
