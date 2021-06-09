package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceArray {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc= new Scanner (System.in);
		
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int j=0;j<a.length;j++)
			{
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);
			//System.out.println(a);
			int count=0;
		    for(int j=0;j<n;j++)
		    {
		    	 if(a[j]>(j+1)) {
		              count=2;
		              break;
		              
		            }else {
		           count+=(j+1)-a[j];
		            }
		          }
		         
		         if(Math.abs(count)%2==0)
		         System.out.println("Second");
		       else 
		         System.out.println("First");
		    }
		}
		catch(Exception e)
		{
			return;
		}

	}

}
