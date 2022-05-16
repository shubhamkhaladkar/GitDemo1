package programs;

public class Test17
{
static int i;

static int j;


static
{
System.out.println("static block of test17 class is started");
System.out.println(i);
System.out.println(j);

i=20;

j=30;

System.out.println("static block of test17 class is ended");

}
}
