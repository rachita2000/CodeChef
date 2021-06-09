package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import codeChef.SummerHeat.FastReader;

public class BellaCiao {
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
   		   long totaldays=s.nextLong();
   		   long days=s.nextLong();
   		   long p=s.nextLong();
   		   long q=s.nextLong();
   		   long amount=0L;
   		   long interval=totaldays/days;
   		   long remains=totaldays%days;
   		   if(totaldays%days==0)
   			   amount+=(days*interval*p)+(q*(interval-1)*interval*days/2);
   		   else
   			 {
   			   amount+=(days*interval*p)+(q*(interval-1)*interval*days/2);
   			   amount+=remains*(p+(interval*q));
   			 }
   		   System.out.println(amount);   	  
   		   }
		 }
		 catch(Exception e)
		 {return;}
	}

}
