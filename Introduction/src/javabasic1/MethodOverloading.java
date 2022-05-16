package javabasic1;

public class MethodOverloading {
	public void getdata() {
		System.out.println("get mehtod is started..");
	}

	public void getdata(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public String getdata(String str) {
		System.out.println(str);
		return str;
	}

	public void getdata(int a)

	{
		System.out.println(a);
	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.getdata();
		m.getdata(10);
		m.getdata("shubham");
		m.getdata(9, 6);
	}
}
