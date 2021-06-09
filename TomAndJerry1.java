package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class TomAndJerry1 {
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
	    	   for(int x=0;x<t;x++) {
	    		   int a=s.nextInt();//Tom Row Num
	    		   int b=s.nextInt();//Tom Colum num
	    		   int c=s.nextInt();//Jerry Row Num
	    		   int d=s.nextInt();//Jerry Column Num
	    		   int k=s.nextInt();//Num of steps
	    		   int i= Math.abs(c-a);
	    		   int j=Math.abs(d-b);
	    		   int z=i+j;
	    		   if(z==k)
	    			   System.out.println("Yes");
	    		   else if(z>k)
	    			   System.out.println("No");
	    		   else if((k-z)%2==0 && k>z)
	    			   System.out.println("Yes");
	    		   else if((k-z)%2==1 && k>z)
	    			   System.out.println("No");
	    		   
	    	   }
	       }
}
