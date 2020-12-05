import java.util.Scanner;

public class A671 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			
		    int n=sc.nextInt();
		    String s=sc.next();
		    System.out.println(solve(s,n));
		    t--;
		}
	}
	static int solve(String s,int n) {
		
		if(n==1&&Integer.parseInt(s)%2==0)return 2;
		if(n==1&&Integer.parseInt(s)%2==1)return 1;
		int odd=0;
		for(int i=0;i<n;i+=2) {
			if((s.charAt(i)-'0')%2==1) {
				odd++;
			}
		}
		int even=0;
		for(int i=1;i<n;i+=2) {
			if((s.charAt(i)-'0')%2==0) {
				even++;
			}
		}
		
		
		if(n%2==1) {
			if(odd>=1)return 1;
			else return 2;
			}
		else {
			if(even>=1)return 2;
			else return 1;
		}
	}

}
