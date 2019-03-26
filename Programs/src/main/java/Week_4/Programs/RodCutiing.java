package Week_4.Programs;
import java.util.*;
public class RodCutiing
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int count=0,m=n+1;
            if(m==1)
                System.out.println(0);
            else
            {
                while(m>0)
                {
                    m=m/2;
                    count++;
                }
                System.out.println(count-2);
            }
        }
    }
}