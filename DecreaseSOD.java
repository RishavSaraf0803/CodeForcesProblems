import java.util.Scanner;

public class DecreaseSOD {

	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			long n=sc.nextLong();
			int sum=sc.nextInt();
			if(sum(n)<=sum)System.out.println(0);
			else
			System.out.println(result(n,sum));
			t--;
		}
	}
	static long result(long n,int sum) {
		long pw=1;long ans=0;
		for(int i=0;i<18;i++) {
			long digit=(n/pw)%10;
			long add=pw*((10-digit)%10);
			n+=add;
			ans+=add;
			if(sum(n)<=sum)break;
			pw*=10;
		}
		return ans;
	}
	static int sum(long n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}
}
		