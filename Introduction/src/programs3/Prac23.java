package programs3;

public class Prac23 
{
 public static void main(String[] args) {
	System.out.println("Main method started..");
	
	int num=1234;
	
	 int sum=0;
	 
	 int r =0;
	 
	 int temp=num;
	 
	 while(temp>0)
	 {
		 r=temp%10;
		 sum =sum*10+r;
		 temp =temp%10;
	 }
	 System.out.println("GIven number:"+num);
	 System.out.println("Reverse number is:"+temp);
	 System.out.println("Program ended");
	
}
}
