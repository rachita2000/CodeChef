package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class CollegeLife4 {

	static int minimumPrice(int n,int e,int h,int a,int b,int c)
	{
		int ans=(int)1e15;
		if(n<=0)
			return 0;
		if(2*n <=e)
			ans=Math.min(ans,n*a);
		if(3*n <=h)
			ans=Math.min(ans,n*b);
		if((n<=e)&&(n<=h))
			ans=Math.min(ans, n*c);
		if(((h-n)/2>=1) && ((h-n)/2>=n-e))
		{
			if(b<c)
			{
				int temp=Math.min(n-1,(h-n)/2);
				ans =Math.min(ans, (b-c)*temp+n*c);
			}
			else
			{
				int temp=Math.max(1,n-e);
				ans=Math.min(ans, (b-c)*temp+n*c);
			}
		}
		//if((e-n)>=1 && (e-n)>=n-h)
		if((e-n)>=1 && (e+h)>=2*n)

		{
			if(a<c)
			{
				int temp=Math.min(n-1,(e-n));
				ans =Math.min(ans, (a-c)*temp+n*c);
			}
			else
			{
				int temp=Math.max(1,n-h);
				ans=Math.min(ans, (a-c)*temp+n*c);
			}
		}
		
		if((e/2>=1) && (e/2>=(3*n-h+2)/3))
		{
			if(a<b)
			{
				int temp=Math.min(n-1,e/2);
				ans =Math.min(ans, (a-b)*temp+n*b);
			}
			else
			{
				int temp=Math.max(1,(3*n-h+2)/3);
				ans=Math.min(ans, (a-b)*temp+n*b);
			}
		}
		if(e>=3 && h>=4 && n>=3)
			ans=Math.min(ans, a+b+c+minimumPrice(n-3,e-3,h-4,a,b,c));
		
		return ans;
	}
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int e=sc.nextInt();
			int h=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int ans=minimumPrice(n,e,h,a,b,c);
			//System.out.println(ans);
			if(ans == (int)1e15 || ans<0)
				System.out.println(-1);
			else
				System.out.println(ans);
			}
		}
		catch(Exception e)
		{
			return;
		}
		}
}

	


