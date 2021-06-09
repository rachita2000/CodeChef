package codeChef;

import java.util.Scanner;

public class NoTimeToWait {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc= new Scanner (System.in);
		int N= sc.nextInt();
 int H= sc.nextInt();
 int x=sc.nextInt();
 int t[] = new int[N];
 int count=0;
 for(int i=0;i<N;i++)
 {
	 t[i]=sc.nextInt();
 }
	 for(int i=0;i<N;i++) {
		 if(t[i]+x == H)
			 {
			 count ++;
			 break;
		 }	}	
		 if(count==1)
			 System.out.println("YES");
		 else
			 System.out.println("NO");
	 
	
	}
	catch (Exception e)
	{
		return ;
	}
	}
}
