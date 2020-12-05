import java.util.*;
public class YATIP {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			System.out.println(printres(a,b));
		    t--;	
		}
	}
	static long printres(long a,long b) {
		long count=0;
		if(a==b) return count;
		long c=Math.abs(a-b);
		if(c>=10) {
			
			count=c/10;
			c=c%10;
		}
		if(c<10&&c!=0)count++;
		return count;
	}
}
