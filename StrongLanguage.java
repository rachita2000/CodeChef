package codeChef;
import java.util.*;
public class StrongLanguage {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner (System.in);
			int t=sc.nextInt();
			for(int i=0;i<t;i++)
			{
				int n=sc.nextInt();
				int k=sc.nextInt();
				sc.nextLine();
				String s=sc.nextLine();
				int temp=0;
				int count=0;
				for(int j=0;j<n;j++)
				{
					if(s.charAt(j)=='*')
					{
						temp++;
						if(temp>=count)
							count=temp;
					}
					else 
						temp=0;
				}
				if(count >=k)
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
