package codeChef;
import java.util.*;
public class FairElection {

	public static void main(String[] args) {
		
		try{
			Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			int b[]= new int[m];
			int sum1=0;
			int sum2=0;
			int count=0;
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
				sum1+=a[j];
			}
			for(int k=0;k<m;k++)
			{
				b[k]=sc.nextInt();
				sum2+=b[k];
			}
			if(sum1>sum2)
			{
				System.out.println(0);
				continue;
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int y=m-1;
			for(int x=0;x<n;x++)
			{
				sum1=sum1-a[x];
				sum2=sum2-b[y];
				sum1=sum1+b[y];
				sum2=sum2+a[x];
				count++;
				y--;
				if(sum1>sum2 || y<0)
					break;
				}
			if(sum1>sum2)
			{
				System.out.println(count);
			}
			else
			{
				System.out.println(-1);
			}
		}
		sc.close();
	}
	catch(Exception e){
		return;
	}
	}

}
