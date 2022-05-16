package programs;

public class Test31 
{
  double ticketprice =250.0;
  double totalamount ;
   
  
  void bookticket (int seats)
  {
	  System.out.println("Tiekct amount is :"+ticketprice);
	  
	  System.out.println("seats are:"+seats);
	  
	  totalamount =  ticketprice*seats;
	  System.out.println("Toatal amount is:"+totalamount);
  }
}

class Bookmyshow extends Test31
{
	double discounts  = 100.0;
	
	@Override
	void bookticket(int seats)
	{
		super.bookticket(seats);
		System.out.println("Discount is:"+discounts);
		
		double d = totalamount-discounts;
		
		System.out.println("toatal amount to pay:"+d);
	}
}