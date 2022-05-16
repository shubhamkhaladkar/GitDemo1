package programs;

public class Test2 
{
  public static void main(String[] args) {
	
	  System.out.println("program started");
	  double yearlyctc =4000000;
	  
	double rv = yearlyctc*.10;
	
	System.out.println("Yearly CTC:"+rv);
	
          double dev = rv/12;
          
          System.out.println("mothly CTC:"+dev);
          
          System.out.println("Program ended");
}
}
