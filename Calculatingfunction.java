import java.util.*;
import java.math.*;

public class Calculatingfunction {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        long n =sc.nextLong();
        
        long result=0;
         
        if(n==0)result=0;
        else if(n%2==1)
        	result=(-1)*(n+1)/2;
        	else 
        		result=n/2;
        
        System.out.print(result);
	}
}
