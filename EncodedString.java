package codeChef;
import java.util.*;
public class EncodedString {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc=new Scanner(System.in);
			String ab="abcdefghijklmnop";
			int t=sc.nextInt();
			int bit=0;
			int decimal=0;
			while(t != 0)
			{
				int n=sc.nextInt();
				sc.nextLine();
				String s=sc.nextLine();
				for(int i=0;i<n;i++)
				{
					++bit;
					if(s.charAt(i)=='1')
					{
						decimal+=Math.pow(2, (4-bit));
						//decimal+=Integer.parseInt(s,2);
					}
					if(bit==4)
					{
						System.out.print(ab.charAt(decimal));
						bit=0;
						decimal=0;
					}
				}
				System.out.println();
			}
			sc.close();
	}
	catch(Exception e){
		return;

	}

	}

}
