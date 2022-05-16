package programs2;

public class Multipleinh3 implements Multipleinh, Multipleinht2 {

	@Override
	public void color(String name) {
		System.out.println("the color is:" + name);

	}

	@Override
	public void equity(int per) {
		System.out.println("the equity is:" + per);

	}

	@Override
	public void brand(String name) {
		System.out.println("The brand name is:" + name);

	}

	@Override
	public void price(double amt) {
		System.out.println("The price is:" + amt);

	}

	public static void main(String[] args) {

		Multipleinh3 mp3 = new Multipleinh3();

		mp3.brand("Samsung");
		mp3.price(23456.00);
		mp3.color("Blue");
		mp3.equity(6);
	}

}
