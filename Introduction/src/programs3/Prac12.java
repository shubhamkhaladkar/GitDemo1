package programs3;

public class Prac12 {
	public static void main(String[] args) {

		System.out.println("Main method started");

		int lines = 5;

		int starcount = 1;

		int spacecount = 4;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spacecount; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= starcount; k++) {
				System.out.print("*");
			}
			System.out.println();
			starcount = starcount + 2;
			spacecount--;
		}
		System.out.println("Main methof ended");
	}
}
