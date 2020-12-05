import java.util.Scanner;

public class A663 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			solve(n);
            t--;
		}
	}
	static void solve(int n) {
		StringBuilder sb=new StringBuilder();
		while(n>=1) {
			sb.append(Integer.toString(n));
			sb.append(" ");
			n--;
		}
		System.out.println(sb.toString());
	}
}
