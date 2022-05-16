package programs2;

public class Subhir2  extends Hira1
{
 public void subhir1()
 {
	 System.out.println("subhir1 method is running..");
 }
 
 public void subhir2()
 {
	 System.out.println("subhir2 method is running..");
 }
 
 public static void main(String[] args) {
	 
	 Subhir2 s2  = new Subhir2();
	 
	 s2.demo1();
	 System.out.println("---------------------");
	 s2.demo2();
	 System.out.println("---------------------");
	 s2.subhir1();
	 System.out.println("---------------------");
	 s2.subhir2();
	
}
}
