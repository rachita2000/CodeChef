package codeChef;
import java.util.*;
public class XOR_Equality {
	 static long power(long x, long y, long p)
	  {
	    long res = 1; // Initialize result
	 
	    x = x % p; // Update x if it is more than or
	    // equal to p
	 
	    if (x == 0)
	      return 0; // In case x is divisible by p;
	 
	    while (y > 0)
	    {
	 
	      // If y is odd, multiply x with result
	      if ((y & 1) != 0)
	        res = (res * x) % p;
	 
	      // y must be even now
	      y = y >> 1; // y = y/2
	      x = (x * x) % p;
	    }
	    return res;
	  }
	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			long n=sc.nextInt();
			long modulo=1000000007;
			long answer=power(2,n-1,modulo);
			System.out.println(answer);
		}
		}
		catch(Exception e)
		{
			return ;
		}
 }
	
}
