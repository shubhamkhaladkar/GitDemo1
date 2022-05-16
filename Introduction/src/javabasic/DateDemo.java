package javabasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo
{
 public static void main(String[] args) {
	
	 Date  d = new Date();
	System.out.println(d.toString());
	
	SimpleDateFormat  sd = new SimpleDateFormat("DD/MM/YYYY");
	SimpleDateFormat  sdf = new SimpleDateFormat("DD/MM/YYYY hh:mm:ss");
	
	System.out.println(sd.format(d));
	System.out.println(sdf.format(d));
	
}
}
