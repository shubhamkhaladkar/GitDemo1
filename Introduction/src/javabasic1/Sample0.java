package javabasic1;

public class Sample0 
{
 public static void main(String[] args) {
	
	 System.out.println("Main method is runnning..");
	 
	 StringBuffer sb  = new StringBuffer("QA");
	 
	 sb.append("Shubham");
	 System.out.println(sb);
	 sb.insert(2, "By");
	 System.out.println(sb); //QAByShubham
	 sb.replace(2, 4, "by");
	 System.out.println(sb);
	 sb.deleteCharAt(3);
	 System.out.println(sb);
	 System.out.println(sb.reverse());
	 
}
}
