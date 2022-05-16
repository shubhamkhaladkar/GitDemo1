package programs;

public class Test3 
{
 public static void main(String[] args) {
	
	 
	 System.out.println("program started");
	 double makingprice = 10;
	 
	 int GST =2;
	 
	 double sellingprice =20;
	 
	 double productpr =   makingprice+GST;
	 
	 System.out.println("Productprice is:"+productpr);
	 
	double profitforoneproduct = sellingprice-productpr;
	
	System.out.println("value of profit for one product is:"+profitforoneproduct);
	
	double profit = profitforoneproduct*25;
	
	System.out.println("profit of 25 product is:"+profit);
	 
	 
	 System.out.println("program ended");
	 
}
}
