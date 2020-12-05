import java.util.Scanner;

public class MinimumProduct {
	
public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0) {
		long a=sc.nextLong();
		long b=sc.nextLong();
		long x=sc.nextLong();
		long y=sc.nextLong();
		long n=sc.nextLong();
		long res1=result(a,b,x,y,n);
		long res2=result(b,a,y,x,n);
		if(res1<=res2)
			System.out.println(res1);
		else
			System.out.println(res2);
		T--;
		}
}
static long result(long a,long b,long x,long y,long n) {
	
	
	
	long a1=a;long b1=b;
	if(a-x>=n)a1=a-n;
	else {
		a1=x;
		n=n-(a-x);    
		if(b-y>=n)
		b1=b-n;
		else {
			b1=y;
			n=n-(b-y);
		}
	}
	return a1*b1;
	
}

}
