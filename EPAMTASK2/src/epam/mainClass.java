package epam;

import java.util.Scanner;
import java.util.logging.Logger;

abstract public class mainClass  extends javafx.application.Application {
	private final static Logger logger = Logger.getLogger("HelloByLogger");
	static
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			logger.info("Enter amount: ");
			double amount=sc.nextDouble();
			logger.info("Enter no.of years: ");
			int years=sc.nextInt();
			logger.info("Enter rate of interest: ");
			double rate=sc.nextDouble();
			InterestCalculator m=new InterestCalculator();
			logger.info("Simple Interest = "+m.simpleInterest(amount,years,rate));
			logger.info("Compound Interest = "+m.compoundInterest(amount,years,rate));
			sc.close();
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
