package codeChef;
import java.math.*;
import java.util.*;

public class WorldRecord {

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			float k1=sc.nextFloat();
			float k2=sc.nextFloat();
			float k3=sc.nextFloat();
			float v=sc.nextFloat();
			float pro=k1*k2*k3*v;
			float f1=(100/pro);
		float f2=Math.round(f1*100.0)/100.0f;
		//System.out.println(f2);
			if(f2 < 9.58f)
				System.out.println("Yes");
			else
				System.out.println("No");
			}
		sc.close();
	}
		catch(Exception e)
		{
			return;
		}
		}

}
