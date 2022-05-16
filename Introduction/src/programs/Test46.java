package programs;

//interface 
public interface Test46 
{
  int a=  10;
  
  void details();
}


//implementation class
class Dev4 implements Test46
{
@Override
public void details()
{
	System.out.println("Details method is running");
}
}
