import java.util.Arrays;
import java.util.Scanner;

/**
 * @author rishav
 *
 */
/**
 * @author rishav
 *
 */
public class B670 {

	

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t>0) {
			int  n=sc.nextInt();
		    long arr[]=new long[n];
		    for(int i=0;i<n;i++) {
		    	arr[i]=sc.nextLong();
		    }
			System.out.println(solve(arr,n));
			t--;
	        }
}
	static long solve(long[]a,int n) {
		long res=1;
		if(n==5) {
			res=a[0]*a[1]*a[2]*a[3]*a[4];
		    return res;
		}
		else {
			
			Arrays.sort(a);
			if(a[0]>=0) {
				for(int i=n-1;i>=n-5;i--) {
					res*=a[i];
				}
				return res;
			}
			else if(a[n-1]<=0) {
				for(int i=n-1;i>=n-5;i--) {
					res*=a[i];
					
				}
				return res;
			}
			
				
				
			else {
				
				long op1=Math.max(a[0]*a[1]*a[2]*a[3]*a[n-1], a[0]*a[1]*a[n-1]*a[n-2]*a[n-3]);
				 res=Math.max(op1, a[n-1]*a[n-2]*a[n-3]*a[n-4]*a[n-5]);
				
				return res;
			
		}
		}
	}
}


