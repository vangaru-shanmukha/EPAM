package Week_4.Programs;
import java.util.*;
public class IndianArmy
{
	static class Pair implements Comparable<Pair>
	{
		Long x,y;
		Pair(long x,long y)
		{
			this.x=x;
			this.y=y;
		}
		public int compareTo(Pair o)
		{
			return x.compareTo(o.x);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int nc=sc.nextInt();
		long sp=sc.nextLong();
		long ep=sc.nextLong();
		Pair p[]=new Pair[nc];
		for(int i=0;i<nc;i++)
		{
			long x=sc.nextLong();
			long y=sc.nextLong();
			p[i]=new Pair(x-y,x+y);
		}
		Arrays.sort(p);
		/*for(int i=0;i<nc;i++)
			System.out.println(p[i].x+" "+p[i].y);*/
		ArrayList<Pair> a=new ArrayList<Pair>();
		long s=p[0].x;
		long e=p[0].y;
		for(int i=1;i<nc;i++)
		{
			if(p[i].x<=e)
			{
				e=Math.max(e,p[i].y);
			}
			else
			{
				a.add(new Pair(s,e));
				s=p[i].x;
				e=p[i].y;
			}
		}
		a.add(new Pair(s,e));
		/*for(int i=0;i<a.size();i++)
			System.out.println(a.get(i).x+" "+a.get(i).y);*/
		long ans=0;
		for(int i=0;i<a.size();i++)
		{
			if(sp>=ep)
			{
				sp=ep;
				break;
			}
			if(sp>=a.get(i).x && sp<=a.get(i).y)
				sp=a.get(i).y;
			else if(sp<=a.get(i).x && ep>=a.get(i).y)
			{
				ans+=a.get(i).x-sp;
				sp=a.get(i).y;
			}
			else if(sp<=a.get(i).x && ep>=a.get(i).x && ep<=a.get(i).y)
			{
			    ans+=a.get(i).x-sp;
				sp=ep;
			}
			else if(sp<=a.get(i).x && ep<=a.get(i).x)
			{
				ans+=ep-sp;
				sp=ep;
			}
		}
		if(sp<ep)
			ans+=ep-sp;
		System.out.println(ans);
	}
}