package codeChef;
import java.util.*;

public class ValidPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b || b==c || c==a)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
