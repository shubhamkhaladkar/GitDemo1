package javabasic;

public class StaticVar
{
 static int a=10;
 
 int b=9;
 
 public static void main(String[] args)
 {
  StaticVar st = new StaticVar();
  
  System.out.println(st.b);
  
 System.out.println(StaticVar.a);
 
 System.out.println(st.b+StaticVar.a);
}
}
