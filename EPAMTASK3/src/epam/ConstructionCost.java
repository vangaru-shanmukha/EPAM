package epam;

public class ConstructionCost {
	public String cost(int standard,int area,String automation)
	{
		double result=0.0;
		if(standard==1 && automation.equals("no"))
		{
			result=1200*area;
		}
		else if(standard==2 && automation.equals("no"))
		{
			result=1500*area;
		}
		else if(standard==3 && automation.equals("no"))
		{
			result=1800*area;
		}
		else if(standard==3 && automation.equals("yes"))
		{
			result=2500*area;
		}
		return result+"";
	}
}
