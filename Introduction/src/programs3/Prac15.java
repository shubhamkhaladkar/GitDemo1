package programs3;

public class Prac15 {
	public static void main(String[] args) {
		System.out.println("Main method strated..");
		int lines = 5;

		int starcount = 1;

		int spacecount = 3;

		int mid = (lines + 1) / 2;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spacecount; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= starcount; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < mid) {
				starcount++;
				spacecount--;
			} else {
				starcount--;
				spacecount++;
			}

		}
		System.out.println("Main method is ended..");
	}
}
