package codeChef;

import java.util.Scanner;

public class Solubility {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner (System.in);
			int t=sc.nextInt();
			for(int i=0;i<t;i++)
			{
				int x=sc.nextInt();
				int a=sc.nextInt();
				int b=sc.nextInt();
				int sol = a+(100-x)*b;
				System.out.println(sol*10);
			}
			}
			catch(Exception e)
			{
				return;
			}
	}

}
