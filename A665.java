import java.util.Scanner;

public class A665 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t>0) {
			int  n=sc.nextInt();int k=sc.nextInt();
			System.out.println(solve(n,k));
			t--;
	        }
	}
	static int solve(int n,int k) {
		if(k==0&&n%2==0)return 0;
		if(k==0&&n%2==1)return 1;
		if(k==n)return 0;
		if(k>n)return k-n;
		else if(k%2==0&&n%2==0)return 0;
		else if(k%2==1&&n%2==0)return 0;
		else return 1;
			
			
		
		
	}
}
