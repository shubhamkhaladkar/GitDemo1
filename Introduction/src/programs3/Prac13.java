package programs3;

public class Prac13 {
	public static void main(String[] args) {
		System.out.println("Main method is started");
		int lines = 5;

		int starcount = 9;

		int space = 0;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= starcount; k++) {
				System.out.print("*");
			}
			System.out.println();
			starcount = starcount - 2;
			space++;
		}
		System.out.println("Main method ended");
	}
}
