import java.util.Scanner;

public class MinimumCoins {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int coins[]=new int[5];
		coins[0]=1;coins[1]=5;coins[2]=10;coins[3]=20;coins[4]=100;
		System.out.println(mincoins(coins,n));
	}
	static int mincoins(int[]coins,int n) {
		int col=coins.length;
		int dp[]=new int[n+1];
		dp[0]=0;
		for(int j=1;j<=n;j++) 
			dp[j]=Integer.MAX_VALUE-1;
			
		for(int i=1;i<=n;i++) {
			for(int j=0;j<col;j++) {
				if(coins[j]<=i)
				
					dp[i]=Integer.min(dp[i-coins[j]]+1,dp[i]);
			
			}
		}
		return dp[n];
	}
	
}
