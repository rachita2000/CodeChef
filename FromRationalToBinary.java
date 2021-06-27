package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import codeChef.UnpleasentOnes.FastReader;

public class FromRationalToBinary {

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
	static boolean isPowerOfTwo (long b)
    {
      
        return b!=0 && ((b&(b-1)) == 0);
         
    }
	public static void main(String[] args) {
		
		 FastReader s = new FastReader();
		 PrintWriter out = new PrintWriter(System.out);
		 int t=s.nextInt();
			for(int i=0;i<t;i++) {
				long a=s.nextLong();
				long b=s.nextLong();
				out.print(isPowerOfTwo(b)?"Yes\n":"No\n");
			}
			out.close();
	}
}
