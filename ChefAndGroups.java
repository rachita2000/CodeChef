package codeChef;

import java.util.Scanner;

public class ChefAndGroups {

	public static void main(String[] args) {
		try
		{
		Scanner sc =new Scanner (System.in);
		int t=sc.nextInt();
		String s;
		
		sc.nextLine();
		for(int i=0;i<t;i++) {
			s=sc.nextLine();
			int group=0;
			if(s.charAt(0)=='1')
				group++;
			
			for(int j=1;j<s.length();j++) {
				
				if(s.charAt(j)=='1' && s.charAt(j)!= s.charAt(j-1))
					group++;
			}
			System.out.println(group);
			}
		}
		catch (Exception e)
		{
			return;
		}
	}

	}

