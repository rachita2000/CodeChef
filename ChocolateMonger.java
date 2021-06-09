package codeChef;
import java.util.*;
public class ChocolateMonger {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int x=sc.nextInt();
			int[] ar=new int[n];
			for(int j=0;j<n;j++)
			ar[j]=sc.nextInt();
			//Arrays.sort(ar);
			Set<Integer> set=new HashSet<>();
			for(int j=0;j<n;j++)
				set.add(ar[j]);
			int dif=n-x;
			if(set.size()<=dif)
				System.out.println(set.size());
			else
				System.out.println(dif);
			}
	}
}
