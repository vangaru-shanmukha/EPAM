package epam;

public class Calculator {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public double div(double a,double b) throws ArithmeticException
	{
		if(b==0)
			throw new ArithmeticException("Division by zero");
		else
		{
			double result=a/b;
			return result;
		}
	}
}
