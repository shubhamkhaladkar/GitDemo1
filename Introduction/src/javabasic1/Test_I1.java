package javabasic1;

public class Test_I1 implements I1
{
  @Override
  public void sample()
  {
	  System.out.println("sample method is started..");
  }
  
  public static void main(String[] args) {
	
	  Test_I1 i1  = new Test_I1();
	  i1.sample();
	  System.out.println(I1.a);
}
}
