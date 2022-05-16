package programs;

public class Test60 
{
	//customexception
	
	int systemopt = 1234;

	void makepayment(int userotp) throws Exception {
		if (systemopt == userotp) {

			System.out.println("Transaction done successfully");

		} else 
		{
             throw new Exception();
		}
		
		System.out.println("Have a wonderful day");
	}
	
	public class Exception extends RuntimeException
	{
		public String getmessage()
		{
		  return "Invalid OTP";	
		}
	}
}
