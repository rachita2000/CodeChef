package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class IntrestingXOR {

	public static void main(String[] args) {
		
		try
		{
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
	for(int i=0;i<t;i++)
		{
			int c=sc.nextInt();
			long s=0,m=1;
			while(c>=s)
			{
				s=(long)Math.pow(2, m);
				m++;
			}
				long a=(long)Math.pow(2, m-2)-1;
				long sum=s-c;
				long result=a*(a+sum);
				System.out.println(result);
		}
		}
		catch(Exception e)
		{
			return;
		}

	}

}
