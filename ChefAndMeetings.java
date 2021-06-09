package codeChef;
import java.util.*;
public class ChefAndMeetings {
	static int print24(String str)
	{
	   
		int h1 = (int)str.charAt(0) - '0';
	    int h2 = (int)str.charAt(1) - '0';
	    Integer hh = (h1 * 10 + h2 % 10);
	    String result="";
	  
	    if (str.charAt(6) == 'A')
	    {
	        if (hh == 12)
	        {
	        	result="00";
	            for (int i = 3; i <str.length()-3; i++)
	            	result=result+str.charAt(i);
	        }
	        else
	        {
	            for (int i = 0; i <str.length()-3; i++) {
	            	if(i==2) 
	            	continue;
	            	result=result+str.charAt(i);}
	        }
	    }
	    else
	    {
	        if (hh == 12)
	        {
	        	result="12";
	            for (int i = 3; i <str.length()-3; i++)
	            	result+=str.charAt(i);	        }
	        else
	        {
	            hh = hh + 12;
	            result=hh.toString();
	            for (int i = 3; i <str.length()-3; i++)
	            	result+=str.charAt(i);
	        }
	    }
	    int finalCon=Integer.parseInt(result);
	    return finalCon;
	} 
	
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<t;i++) {
				String s=sc.nextLine();
				int P=print24(s);
				int n=sc.nextInt();
				sc.nextLine();
				for(int j=0;j<n;j++) {
					String temp=sc.nextLine();
					String s1=temp.substring(0, 8);
					int L=print24(s1);
					String s2=temp.substring(9,17);
					int R=print24(s2);
					if(L <= P && P <= R)
						System.out.print(1);
					else
						System.out.print(0);
				}
				System.out.println();
			}
		}catch(Exception e) {
			return;
		}

	}

}
