package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class MaximiseFunction {

	public static void main(String[] args) {
		try {
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			long a[]= new long [n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			long x= a[0];
			long y=a[1];
			long z=a[n-1];
			long ans= Math.abs(x-y)+ Math.abs(y-z)+ Math.abs(z-x);
			y=a[0];
			ans=Math.max(ans, Math.abs(x-y)+ Math.abs(y-z)+ Math.abs(z-x));
			x=a[1];
			y=a[1];
			ans=Math.max(ans, Math.abs(x-y)+ Math.abs(y-z)+ Math.abs(z-x));
			System.out.println(ans);
		}
		sc.close();
		}
		catch(Exception e){
			return;
		}
	}

}
