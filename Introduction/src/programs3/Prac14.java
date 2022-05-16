package programs3;

public class Prac14 {
	public static void main(String[] args) {
		System.out.println("Main method is started..");
		int lines = 5;

		int starcount = 1;

		int mid = (lines + 1) / 2;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= starcount; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < mid) {
				starcount++;
			} else {
				starcount--;
			}
		}
		System.out.println("Program ended");

	}
}
