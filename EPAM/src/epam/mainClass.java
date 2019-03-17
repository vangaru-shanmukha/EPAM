package epam;
import java.util.*;
import java.util.logging.Logger;
import java.lang.reflect.*;
abstract class mainClass extends javafx.application.Application {
	private final static Logger logger = Logger.getLogger("HelloByLogger");
	static
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			logger.info("Enter first number : ");
			double a=sc.nextDouble();
			logger.info("Enter second number: ");
			double b=sc.nextDouble();
			Calculator c1=new Calculator();
			c1.add(a,b);
			logger.info("Addition of numbers: "+c1.getResult());
			Calculator c2=new Calculator();
			c2.mul(a,b);
			logger.info("Multiplication of numbers: "+c2.getResult());
			Calculator c3=new Calculator();
			c3.div(a,b);
			logger.info("Division of numbers: "+c3.getResult());
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
