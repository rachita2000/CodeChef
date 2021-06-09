package codeChef;
import java.io.*;
import java.util.*;
import java.util.*;
public class Golf {
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
	 
	        double nextDouble()
	        {
	            return Double.parseDouble(next());
	        }
	 
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
		try{
			
			FastReader fr=new FastReader();
			int t=fr.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=fr.nextLong();
			long x=fr.nextLong();
			long k=fr.nextLong();
			
			if((x%k==0) || ((n+1-x)%k==0))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		}
		catch(Exception e)
		{
			return;
		}
//		ArrayList<Integer> a=new ArrayList<>();
//		ArrayList<Integer> b=new ArrayList<>();
		
//		for(int j=0;j<=n+1;j+=k)
//		{
//			if(j%k==0)
//				a.add(j);
//		}
//		for(int z=n+1;z>=0;z-=k)
//		{
//			if(z%k==0)
//				b.add(z);
//		}
//		System.out.println(a);
//		System.out.println(b);
		
	}

}
