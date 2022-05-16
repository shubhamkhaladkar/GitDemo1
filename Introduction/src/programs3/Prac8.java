package programs3;

public class Prac8 {
	public static void main(String[] args) {

		System.out.println("Main method is started...");

		int space = 5;

		int starcount = 1;

		int lines = 5;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= starcount; k++) {
            System.out.print("*");
			}
			System.out.println();
			starcount++;
			space--;
		}
		System.out.println("Main method ended..");
	}
}
