package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class ModularEquation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	for(int T=0;T<t;T++) {
		int N=sc.nextInt();
		int M=sc.nextInt();
		long result=0;
		long[] ary=new long [N+1];
		Arrays.fill(ary, 1);
		for(int j=2;j<=N;j++) {
			int a=M%j;
			result+=ary[a];
			for(int k=a;k<=N;k+=j) {
				ary[k]++;
			}
		}
		System.out.println(result);
	}

	}

}
