package epam;
import java.util.*;
public class Calculator {
	double result=0;
	public void add(double a,double b)
	{
		result=a+b;
	}
	public void mul(double a,double b)
	{
		result=a*b;
	}
	public void div(double a,double b)
	{
		result=a/b;
	}
	public String getResult()
	{
		return Double.toString(result);
	}
}
