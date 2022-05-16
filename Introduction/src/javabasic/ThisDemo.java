package javabasic;

public class ThisDemo
{
int a  =10;
public void simdata()
{
int a=3;
System.out.println(a);
System.out.println(this.a);
System.out.println(this.a+a);
}

public static void main(String[] args) {
	
	ThisDemo td = new ThisDemo();
	
	td.simdata();
}

}
