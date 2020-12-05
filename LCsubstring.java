import java.util.Scanner;

public class LCsubstring {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int m=sc.nextInt();int n=sc.nextInt();
			String x=sc.next();String y=sc.next();
		    System.out.println(solve(x,y,m,n));
		    t--;
		}
	}
	static int solve (String x,String y,int m,int n) {
		int dp[][]=new int [m+1][n+1];
		int res=0;
		for(int i=0;i<=m;i++) 
			dp[i][0]=0;
			
		for(int i=0;i<=n;i++)
			dp[0][i]=0;
	
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(x.charAt(i-1)==y.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				    res=Math.max(res, dp[i][j]);	
				}
				else
					dp[i][j]=0;
			}
		}
		
		
			return res;
	}

}
