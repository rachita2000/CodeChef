package codeChef;
import java.util.*;
public class HDivisior {

	public static void main(String[] args) {
		try {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for (int i=1;i<=10;i++) {
	        if (n%i==0) 
	        {
	        	if(count < i) {
	        		count =i;
	        	}
	        }
	        
		}
		sc.close();
		System.out.println(count);
		}
		catch(Exception e){
			return;
		}
		
	}
		
}
