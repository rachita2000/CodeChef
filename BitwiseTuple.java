package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import codeChef.BellaCiao.FastReader;

public class BitwiseTuple {

	public static long fastPower(long x,long y,int mod)
	{
		long res=1;
		while(y>0)
		{
			if((y&1)!=0)
				res=(res % mod * x % mod) % mod;
			x=(x%mod * x%mod)%mod;
			y=y>>1;
		}
		return res;
	}
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
   }
	public static void main(String[] args) {
		 try {
		 FastReader s = new FastReader();
   	   int t=s.nextInt();
   	   for(int tc=0;tc<t;tc++) 
   	   {
   		   long n=s.nextLong();
   		   long m=s.nextLong();
   		   int mod=1000000007;
   		   long x=fastPower(2,n,mod)-1;
   		   long y=fastPower(x,m,mod);
   		   System.out.println(y);
   	   }

	}catch(Exception e)
		 {return;}
}

}
