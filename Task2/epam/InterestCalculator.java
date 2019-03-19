package epam;

public class InterestCalculator {
	public double simpleInterest(double amount,int years,double rate)
	{
		return (amount*years*rate)/100.0;
	}
	public double compoundInterest(double amount,int years,double rate)
	{
		return amount*Math.pow(1.0+rate/100.0,years)-amount;
	}
}
