package programs2;

public class Swap1 
{
 public static void main(String[] args) {
	
	 System.out.println("Main method is started...");
	 
	 int a  =10;
	 
	 int b =20;
	 
	 a=a+b; //(20+10=30)
	 b=a-b;
	 a=a-b;
	 
	 System.out.println("a's value:"+a);
	 
	 System.out.println("b's value:"+b);
}
}
