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
			logger.info("1:Standard materials\n"
					+ "2:Medium standard materials\n"
					+ "3.High standard materials");
			logger.info("Enter material standards(1/2/3)");
			int standard=sc.nextInt();
			logger.info("Enter area of the house in square feets: ");
			int area=sc.nextInt();
			logger.info("Enter 'yes' for automated house"
					+ "Enter 'no' for normal house");
			String automation=sc.next();
			ConstructionCost c=new ConstructionCost();
			logger.info("Construction cost = "+c.cost(standard,area,automation));
			sc.close();
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}