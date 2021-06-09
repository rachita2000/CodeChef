package codeChef;
import java.util.*;
public class ChefAndDivision3 {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner (System.in);
		int t= sc.nextInt();
		while (t != 0)
		{
			int n= sc.nextInt();
			int k=sc.nextInt();
			int d=sc.nextInt();
			int A[]= new int[n];
			int sum=0;
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextInt();
				sum+=A[i];
			}
			long Days= Math.floorDiv(sum,k);
			if(Days>d)
				System.out.println(d);
			else
				System.out.println(Days);
		}
		sc.close();
		}
		catch(Exception e){
			return;

		}
	}
}


