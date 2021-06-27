package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import codeChef.BellaCiao.FastReader;

public class FalseNumber {

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
		
		 FastReader s = new FastReader();
   	   int t=s.nextInt();
   	   for(int tc=0;tc<t;tc++) 
   	   {
   		   String a=s.next();
   		   
   		   String add="";
   		   if(a.charAt(0)=='1')
   			   add+=a.charAt(0)+"0"+a.substring(1);
   		   else
   			   add+="1"+a;
   		   
   		   System.out.println(add);
   		   
   	   }
		
	}
		 
}
