package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class UnpleasentOnes {
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
			for(int i=0;i<t;i++) {
				int n=s.nextInt();
				int[]ar=new int[n];
				ArrayDeque<Integer>re=new ArrayDeque<>();
				for(int j=0;j<n;j++) {
					ar[j]=s.nextInt();
					if((ar[j]& 1)==0) {
						re.addFirst(ar[j]);
					}else {
						re.addLast(ar[j]);
					}
				}
				Integer[]ans=new Integer[n];
				re.toArray(ans);
				
				for(int a:ans)
					System.out.print(a+" ");
			}
	}
}
