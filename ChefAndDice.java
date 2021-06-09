package codeChef;
import java.util.*;
public class ChefAndDice {

	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=sc.nextLong();
			long sum=0;
			long f2=0,f3=0,f4=0,f5=0;
			long f=0;
			long x=n%4;
			long y=n/4;
			if(x==1)
				f5=1;
			if(x==2)
				f4=2;
			if(x==3)
			{
				f4=2;
				f3=1;
			}
			if(y>0)
			{
				f2=f2+(y*4);
				f=(4-x)*4;
			}
			sum+=(f2*11)+(f3*15)+(f4*18)+(f5*20)+f;
			System.out.println(sum);
		}
		}
		catch(Exception e)
		{
			return;
		}
	}

}
