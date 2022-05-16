package alphapackage;

import org.apache.logging.log4j.*;
public class Demo1 
{
	private static Logger log  = LogManager.getLogger(Demo1.class.getName());
 @SuppressWarnings("unused")
public static void main(String[] args) {
	 log.debug("I am debugging");
	   if(5>4)
     {
  	  log.debug(" condition is true"); 
  	  log.error("Error message");
     }
	   else 
	   {
		   log.fatal("this is fatal");
	   }
}
}
