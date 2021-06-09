package codeChef;
import java.util.*;
public class WortyMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			long k=sc.nextLong();
			int count=0;
			long [][] a=new long [n][m]; 
			for(int r=0;r<n;r++)
			{
				for(int c=0;c<m;c++)
				{
					 a[r][c]=sc.nextLong();
					 
					 if(a[r][c] >= k)
						 count++;
				}
			} 
			System.out.println(count);
		}

	}

}
