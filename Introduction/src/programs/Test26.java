package programs;

public class Test26 
{
 public static void main(String[] args) {
	
	 Test25 t = new Test25();
	 
	 t.fatherproperty();
	 
	 
	 System.out.println("----------------------");
	 
	 
	 Son s =  new Son();
	 s.fatherproperty();
	 
	 System.out.println("----------------------");
	 
	 s.sonproperty();
}
}
