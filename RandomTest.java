package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RandomTest {
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
 
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	       public static void main(String[] args) {
	    	   FastReader s = new FastReader();
	    	   int t=s.nextInt();
	    	   for(int x=0;x<t;x++) {
	    		   int n=s.nextInt();
	    		   int k=s.nextInt();
	    		   String S=s.nextLine();
	    		   char[] ss=new char[n];
	    		   int[] arr=new int[k];
	    		   int sum=0;
	    		   for(int j=0;j<ss.length-1;j++)
    			   {
    				   if(ss[j]==ss[j+1])
    					   sum+=2;
    				   else
    					   sum++;
    			   }
	    		  while(k!=0)
	    		   {
	    			   
	    			   int q=s.nextInt(),c=0,m=0;
	    			  if(q==1)
	    			  {
	    				  if(ss[q-1]==ss[q])
	    				   c+=2;
	    				  else
	    				   c+=1;
	    				  System.out.println(1);
	    			  }
	    			  else if(q==n)
	    			  {
	    				  if(ss[q-1]==ss[q-2])
	    					  c+=2;
	    				  else
	    					  c+=1;
	    				  System.out.println(2);
	    			  }
	    			  else 
	    			  {
	    				  if(ss[q-1]==ss[q-2]&&ss[q-1]==ss[q])
	    					  c+=4;
	    				  else if(ss[q-2]==ss[q])
	    					  c+=2;
	    				  else
	    					  c+=3;
	    				  System.out.println(3);
	    			  }
	    			  if(ss[q-1]=='0')
	    				  ss[q-1]='1';
	    			  else
	    				  ss[q-1]='0';
	    			  if(q==1)
	    			  {
	    				  if(ss[q-1]==ss[q-2])
	    					  m+=2;
	    				  else
	    					  m+=1;
	    				  System.out.println(4);
	    			  }
	    			  else if(q==n)
	    			  {
	    				  if(ss[q-1]==ss[q-2])
	    					  m+=2;
	    				  else
	    					  m+=1;
	    				  System.out.println(5);
	    			  }
	    			  else
	    			  {
	    				  if(ss[q-1]==ss[q-2]&&ss[q-1]==ss[q])
	    					  m+=4;
	    				  else if(ss[q-2]==ss[q])
	    					  m+=2;
	    				  else
	    					  m+=1;
	    				  System.out.println(6);
	    			  }
	    			  if(c>m)
	    				  sum=sum-(c-m);
	    			  else if(c<m)
	    				  sum=sum+(m-c);
	    			  System.out.println("sum ="+sum);
	    			  k--;
	    		   }
	    		   
	    	   }
	       }
	       
	}
