package codeChef;
import java.util.*;
public class TikTacToe {

	public static void main(String[] args) {
		try{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int T=0;T<t;T++)
		{		int xwin=0,owin=0,cx=0,co=0,c_=0;
			char[][] c=new char[3][3];
			for (int i = 0; i < 3; i++) {
	            String data = "";
	            if (sc.hasNext()) { 
	                data = sc.next();
	            } else {
	                break;
	            }
	            for (int j = 0; j <3; j++)
	            {
	            	c[i][j] = data.charAt(j); 
	            	if(c[i][j]=='X')
						cx++;
					else if(c[i][j]=='O')
						co++;
					else
						c_++;
	            }
	        }			
//				for(int i=0;i<3;i++)
//				{
//					for(int j=0;j<3;j++)
//					{
//						System.out.print(c[i][j]);
//					}
//					System.out.println();
//				}
			//System.out.println(cx+" "+co+" "+c_);
		if(c[0][0] =='X' && c[0][1] == 'X' && c[0][2]=='X')
			xwin=1;
		if(c[1][0] =='X' && c[1][1] == 'X' && c[1][2]=='X')
			xwin=1;
		if(c[2][0] =='X' && c[2][1] == 'X' && c[2][2]=='X')
			xwin=1;
		if(c[0][0] =='X' && c[1][0] == 'X' && c[2][0]=='X')
			xwin=1;
		if(c[0][1] =='X' && c[1][1] == 'X' && c[2][1]=='X')
			xwin=1;
		if(c[0][2] =='X' && c[1][2] == 'X' && c[2][2]=='X')
			xwin=1;
		if(c[0][0] =='X' && c[1][1] == 'X' && c[2][2]=='X')
			xwin=1;
		if(c[0][2] =='X' && c[1][1] == 'X' && c[2][0]=='X')
			xwin=1;
		if(c[0][0] =='O' && c[0][1] == 'O' && c[0][2]=='O')
			owin=1;
		if(c[1][0] =='O' && c[1][1] == 'O' && c[1][2]=='O')
			owin=1;
		if(c[2][0] =='O' && c[2][1] == 'O' && c[2][2]=='O')
			owin=1;
		if(c[0][0] =='O' && c[1][0] == 'O' && c[2][0]=='O')
			owin=1;
		if(c[0][1] =='O' && c[1][1] == 'O' && c[2][1]=='O')
			owin=1;
		if(c[0][2] =='O' && c[1][2] == 'O' && c[2][2]=='O')
			owin=1;
		if(c[0][0] =='O' && c[1][1] == 'O' && c[2][2]=='O')
			owin=1;
		if(c[0][2] =='O' && c[1][1] == 'O' && c[2][0]=='O')
			owin=1;
		if((xwin==1 && owin==1) || ((cx-co>1) || (cx-co<0))) 
			System.out.println("3");
		else if(cx==0 && co==0 && c_==0)
			System.out.println("2");
		else if(xwin==0 && owin==0 && c_>0)
			System.out.println("2");
		else if(xwin==1 && owin==0 && cx>co)
			System.out.println("1");
		else if(xwin==0 && owin==1 && cx==co)
			System.out.println("1");
		else if(xwin==0 && owin==0 && c_==0)
			System.out.println("1");
		else
			System.out.println("3");
		
		}
		}
		catch(Exception e)
		{
			return;
		}
	}

}
