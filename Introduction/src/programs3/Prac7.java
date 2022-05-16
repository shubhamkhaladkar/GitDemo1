package programs3;

public class Prac7 {
	public static void main(String[] args) {
		System.out.println("Main method is satrted..");

		int lines = 10;

		int starcount = 10;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= starcount; j++) {
				if (i % 2 == 0) {
					System.out.print("*");
				}

			}
			starcount--;

			System.out.println();
		}

		System.out.println("Main method ended");
	}
}
