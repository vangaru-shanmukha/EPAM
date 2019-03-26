package Week_4.Programs;
import java.util.*;
public class StatisticsOfString
{
    public static int ZAlgorithm(String s)
    {
        //int z[]=new int[s.length()];
        int max=0;
        for(int i=1;i<s.length();i++)
        {
            char c=s.charAt(0);
            int p=1,count=0;
            for(int j=i;j<s.length();j++)
            {
                if(c==s.charAt(j))
                {
                    count++;
                    c=s.charAt(p++);
                }
                else
                    break;
            }
            if(max<count)
                max=count;
        }
        /*for(int i=0;i<z.length;i++)
            System.out.print(z[i]);*/
        return max;
    }
    public static void Permute(char[] c,int len)
    {
        int n = c.length;  
        PermuteRec(c, "", n, len); 
        //System.out.println(s1);
    }
    public static int MAX;
    public static void PermuteRec(char[] c,String s,int n,int len)
    {
        if(len == 0)  
        { 
            //System.out.println(s);
            int ans=ZAlgorithm(s);
            MAX+=ans;
            return; 
        } 
        for (int i = 0; i < n; ++i) 
        { 
            String s1 = s + c[i];  
            PermuteRec(c, s1, n, len - 1);  
        }
        //return s;
    }
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int cl=sc.nextInt();
        int mod=sc.nextInt();
        char c[]=new char[cl];
        for(int i=0;i<cl;i++)
        {
            c[i]=(char)(97+i);
        }
        /*for(int i=0;i<c.length;i++)
            System.out.println(c[i]);*/
        Permute(c,len);
        System.out.println(MAX%mod);
    }
}