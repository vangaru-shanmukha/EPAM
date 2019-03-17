package epam;

public class InterestCalculator {
	public String simpleInterest(double amount,int years,double rate)
	{
		double si=(amount*years*rate)/100.0;
		return si+"";
	}
	public String compoundInterest(double amount,int years,double rate)
	{
		double ci=amount*Math.pow(1.0+rate/100.0,years)-amount;
		return ci+"";
	}
}