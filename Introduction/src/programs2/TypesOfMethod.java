package programs2;

public class TypesOfMethod 
{
 public static void test1()
 {
	 int a= 10;
	 
	 int b =20;
	 
	 System.out.println("A's value:"+a);
	 
	 System.out.println("B's value:"+b);
 }
 
 public static void test2(int a, int b)
 {
	 System.out.println("a's value:"+a);
	 
	 System.out.println("b's value:"+b);
 }
 
 public static void main(String[] args) {
	
	 System.out.println("Main method started..");
	 
	 TypesOfMethod.test1();
	 System.out.println("------");
	 TypesOfMethod.test2(10, 20);
}
 
}
