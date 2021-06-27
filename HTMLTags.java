package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import codeChef.FalseNumber.FastReader;

public class HTMLTags {
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
   		   
   		   if(a.length()>=4 && a.charAt(0)=='<' && a.charAt(1)=='/' && a.charAt(a.length()-1)=='>') {
   		   if(a.substring(2,a.length()-1).matches("[a-z0-9]+") || a.substring(2,a.length()-1).matches("[0-9]+") || a.substring(2,a.length()-1).matches("[a-z]+"))
   			   System.out.println("Success");
   		   else
   			   System.out.println("Error");
   		   }
   		   else
   			   System.out.println("Error");
   		   }
   	   }
	}

