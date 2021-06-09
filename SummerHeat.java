package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SummerHeat {

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
   }
	public static void main(String[] args) {
		  FastReader s = new FastReader();
   	   int t=s.nextInt();
   	   for(int tc=0;tc<t;tc++) 
   	   {
   		   int ag=s.nextInt();
   		   int bg=s.nextInt();
   		   int agpw=s.nextInt();
   		   int bgpw=s.nextInt();
   		   System.out.println((agpw/ag)+(bgpw/bg));
   	   }

	}

}
