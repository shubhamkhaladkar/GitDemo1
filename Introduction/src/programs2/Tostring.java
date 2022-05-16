package programs2;

public class Tostring 
{
  public static void main(String[] args) {
	System.out.println("main method is started...");
	
	String str = "Shubham";
	
	String str1 = "Shubham";
	
	Tostring  ts  = new Tostring();
	
	System.out.println("Full qualified address of an object:"+ts.toString());
	
	System.out.println("Memory cell address of an object:"+ts.hashCode());
	
	System.out.println("Class name is:"+ts.getClass());
	
	System.out.println(str.equals(str1));
	
	ts=null;
	
	System.gc();
}
  
  

}
