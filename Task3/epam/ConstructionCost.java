package epam;

public class ConstructionCost {
	public double cost(String standard,int area,String automation)
	{
		double result=0.0;
		if(standard.equals("above") && automation.equals("no"))
		{
			result=1500*area;
		}
		else if(standard.equals("high") && automation.equals("no"))
		{
			result=1800*area;
		}
		else if(standard.equals("high") && automation.equals("yes"))
		{
			result=2500*area;
		}
		else
		{
			result=1200*area;
		}
		return result;
	}
}
